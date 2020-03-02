/*
 * ******************************************************
 * Copyright VMware, Inc. 2016.  All Rights Reserved.
 * ******************************************************
 *
 * DISCLAIMER. THIS PROGRAM IS PROVIDED TO YOU "AS IS" WITHOUT
 * WARRANTIES OR CONDITIONS # OF ANY KIND, WHETHER ORAL OR WRITTEN,
 * EXPRESS OR IMPLIED. THE AUTHOR SPECIFICALLY # DISCLAIMS ANY IMPLIED
 * WARRANTIES OR CONDITIONS OF MERCHANTABILITY, SATISFACTORY # QUALITY,
 * NON-INFRINGEMENT AND FITNESS FOR A PARTICULAR PURPOSE.
 */

package com.vmware.fcd;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.vmware.common.annotations.Action;
import com.vmware.common.annotations.Option;
import com.vmware.common.annotations.Sample;
import com.vmware.connection.ConnectedVimServiceBase;
import com.vmware.vim25.AlreadyExistsFaultMsg;
import com.vmware.vim25.FileFaultFaultMsg;
import com.vmware.vim25.InvalidCollectorVersionFaultMsg;
import com.vmware.vim25.InvalidDatastoreFaultMsg;
import com.vmware.vim25.InvalidPropertyFaultMsg;
import com.vmware.vim25.LocalizedMethodFault;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.RuntimeFaultFaultMsg;
import com.vmware.vim25.TaskInfoState;
import com.vmware.vim25.VStorageObject;

/**
 * <pre>
 * FcdRegisterLegacyDisk
 *
 * This sample registers a given legacy disk as First class disk.
 *
 * <b>Parameters:</b>
 * url                    [required] : url of the web service
 * username               [required] : username for the authentication
 * password               [required] : password for the authentication
 * legacydiskfilename     [required] : File name of the legacy disk
 * datacentername         [required] : Name of the datacenter
 * fcdname                [optional] : Name of the newly created first class
 *                                     disk object.
 *
 * <b>Command Line:</b>
 * Register a given legacy disk as First class disk.
 * run.bat com.vmware.vm.FcdAttachToVM --url [webserviceurl]
 * --username [username] --password [password]
 * --legacydiskfilename [legacydiskfilename]
 *
 * Ex: --legacydiskfilename "[sharedVmfs-0] TestVm_REKZ/TestVm_REKZ.vmdk"
 * </pre>
 */
@Sample(name = "fcd-registerlegacydisk", description = "This sample registers"
        + " a given legacy disk as First class disk.")
public class FcdRegisterLegacyDisk extends ConnectedVimServiceBase {

    private String legacyDiskFileName;
    private String dataCenterName;
    private String fcdName;

    /**
     * @param legacyDiskFileName the legacyDiskFileName to set
     */
    @Option(name = "legacydiskfilename",
            required = true,
            description = "File name of the legacy disk.")
    public void setLegacyDiskFileName(String legacyDiskFileName) {
        this.legacyDiskFileName = legacyDiskFileName;
    }

    /**
     * @param dataCenterName the dataCenterName to set
     */
    @Option(name = "datacentername",
            required = true,
            description = "Name of the datacenter")
    public void setDataCenterName(String dataCenterName) {
        this.dataCenterName = dataCenterName;
    }

    /**
     * @param fcdName the fcdName to set
     */
    @Option(name = "fcdname",
            required = false,
            description = "File name of the legacy disk.")
    public void setFcdName(String fcdName) {
        this.fcdName = fcdName;
    }

    /**
     * This method returns a boolean value specifying whether the Task is
     * succeeded or failed.
     *
     * @param task
     *            ManagedObjectReference representing the Task.
     * @return boolean value representing the Task result.
     * @throws InvalidCollectorVersionFaultMsg
     * @throws RuntimeFaultFaultMsg
     * @throws InvalidPropertyFaultMsg
     */
    boolean getTaskResultAfterDone(ManagedObjectReference task)
            throws InvalidPropertyFaultMsg, RuntimeFaultFaultMsg,
            InvalidCollectorVersionFaultMsg {

        boolean retVal = false;

        // info has a property - state for state of the task
        Object[] result = waitForValues.wait(task, new String[] { "info.state",
                "info.error" }, new String[] { "state" },
                new Object[][] { new Object[] { TaskInfoState.SUCCESS,
                        TaskInfoState.ERROR } });

        if (result[0].equals(TaskInfoState.SUCCESS)) {
            retVal = true;
        }
        if (result[1] instanceof LocalizedMethodFault) {
            throw new RuntimeException(
                    ((LocalizedMethodFault) result[1]).getLocalizedMessage());
        }
        return retVal;
    }

    void registerDiskAsFCD() throws AlreadyExistsFaultMsg, FileFaultFaultMsg,
            InvalidDatastoreFaultMsg, RuntimeFaultFaultMsg {
        // Get vStorageObjectManager Mor.
        ManagedObjectReference morVStrObjManager = connection
                .getServiceContent().getVStorageObjectManager();

        // Generate the httpUrl from diskPath which the vc recognizes.
        String legacyDiskPathForVc = getDiskPathForVc(legacyDiskFileName);

        // Register the disk as FirstClassDisk.
        System.out.println("Operation: Register a legacy disk as FCD with" +
                " disk Path :: " + legacyDiskPathForVc);
        VStorageObject registeredVStrObj = vimPort.registerDisk(
                morVStrObjManager, legacyDiskPathForVc, fcdName);

        System.out.printf("Success: Registered Disk(now a vStorageObject) :"
                + " [Uuid = %s ] with Name [ %s ]%n", registeredVStrObj
                .getConfig().getId().getId(), registeredVStrObj.getConfig()
                .getName());
    }

    /**
     * Util method to get the diskPath recognized by vc for a given disk.
     *
     * @param vStorageObject
     * @return filePath of vStorageObject
     */
    private String getDiskPathForVc(String fileNameOfDisk) {
        // Ex: vmdkLocation is :: [sharedVmfs-0] TestVm_3PYN/TestVm_3PYN.vmdk.
        String regex1 = "\\[(.*)\\]\\s(.*)/(.*\\.vmdk)";
        String ds = null;
        String vmFolder = null;
        String vmdk = null;
        if (Pattern.matches(regex1, fileNameOfDisk)) {
            System.out.println("Info: FileName Pattern matches required" +
                    " pattern.");
            Pattern pattern1 = Pattern.compile(regex1);
            Matcher m = pattern1.matcher(fileNameOfDisk);
            if (m.find()) {
                ds = m.group(1);
                vmFolder = m.group(2);
                vmdk = m.group(3);
            }
        }
        /*
         * diskPath format as recognized by VC:
         * https://<VCIP>/folder/<PathToVmdkInsideDatastore
         * >?dcPath=<DataCenterName>&dsName=<DatastoreName>
         *
         * Ex: diskpath =
         * https://10.160.232.230/folder/TestVm_REKZ/TestVm_REKZ.vmdk
         * ?dcPath=vcqaDC&dsName=sharedVmfs-0
         */

        String diskPath = "https://" + connection.getHost() + "/" + "folder/"
                + vmFolder + "/" + vmdk + "?dcPath=" + dataCenterName
                + "&dsName=" + ds;
        return diskPath;
    }

    @Action
    public void run() throws AlreadyExistsFaultMsg, FileFaultFaultMsg,
            InvalidDatastoreFaultMsg, RuntimeFaultFaultMsg {
        registerDiskAsFCD();
    }
}
