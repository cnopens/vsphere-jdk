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

import com.vmware.common.annotations.Action;
import com.vmware.common.annotations.Option;
import com.vmware.common.annotations.Sample;
import com.vmware.connection.ConnectedVimServiceBase;
import com.vmware.fcd.helpers.FcdHelper;
import com.vmware.vim25.DeviceUnsupportedForVmVersionFaultMsg;
import com.vmware.vim25.FileFaultFaultMsg;
import com.vmware.vim25.InvalidCollectorVersionFaultMsg;
import com.vmware.vim25.InvalidControllerFaultMsg;
import com.vmware.vim25.InvalidDatastoreFaultMsg;
import com.vmware.vim25.InvalidPropertyFaultMsg;
import com.vmware.vim25.InvalidStateFaultMsg;
import com.vmware.vim25.LocalizedMethodFault;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.MissingControllerFaultMsg;
import com.vmware.vim25.NotFoundFaultMsg;
import com.vmware.vim25.RuntimeFaultFaultMsg;
import com.vmware.vim25.TaskInfoState;
import com.vmware.vim25.VStorageObject;
import com.vmware.vim25.VmConfigFaultFaultMsg;

/**
 * <pre>
 * FcdAttachToVM
 *
 * This sample attaches a given virtual storage object to the given virtual
 * machine.
 *
 * <b>Parameters:</b>
 * url                    [required] : url of the web service
 * username               [required] : username for the authentication
 * password               [required] : password for the authentication
 * vstorageobjectid       [required] : Uuid of the disk
 * datastorename          [required] : Name of the datastore which contains
 *                                     the virtual storage object
 * vmname                 [required] : Name of the virtual machine. A minimum
 *                                     virtual machine version of 'vmx-13' is
 *                                     required for the attach operation to
 *                                     succeed
 * controllerkey          [optional] : Device Key of the controller the disk
 *                                     will connect to. It can be unset if
 *                                     there is only one controller (SCSI or
 *                                     SATA) with the available slot in the
 *                                     virtual machine. If there are multiple
 *                                     SCSI or SATA controllers available, user
 *                                     must specify the controller
 * unitnumber             [optional] : Unit number of the virtual machine
 * <b>Command Line:</b>
 * Attach a given virtual storage object to the given virtual machine.
 * run.bat com.vmware.vm.FcdAttachToVM --url [webserviceurl] --username [username]
 * --password [password] --vstorageobjectid [vstorageobjectid] --vmname [vmname]
 *
 * Attach a given virtual storage object to the given virtual machine by specifying
 * controller key and unit number.
 * run.bat com.vmware.vm.FcdAttachToVM --url [webserviceurl] --username [username]
 * --password [password] --vstorageobjectid [vstorageobjectid] --vmname [vmname]
 * --controllerkey [controllerkey] --unitnumber [unitnumber]
 * </pre>
 */
@Sample(name = "fcd-attachtovm", description = "This sample attaches a given"
        + " virtual storage object(FCD) to the given virtual machine.")
public class FcdAttachToVM extends ConnectedVimServiceBase {

    private String vStorageObjectId;
    private String datastoreName;
    private String vmName;
    private Integer controllerKey;
    private Integer unitNumber;

    /**
     * @param vStorageObjectId the vStorageObjectId to set
     */
    @Option(name = "vstorageobjectid",
            required = true,
            description = "Uuid of the disk.")
    public void setVStorageObjectId(String vStorageObjectId) {
        this.vStorageObjectId = vStorageObjectId;
    }

    /**
     * @param datastoreName the datastoreName to set
     */
    @Option(name = "datastorename",
            required = true,
            description = "Name of datastore containing the vstorageobject.")
    public void setDatastoreName(String datastoreName) {
        this.datastoreName = datastoreName;
    }

    /**
     * @param vmName the vmName to set
     */
    @Option(name = "vmname",
            required = true,
            description = "Name of virtual machine.")
    public void setVmName(String vmName) {
        this.vmName = vmName;
    }

    /**
     * @param controllerKey the controllerKey to set
     */
    @Option(name = "controllerkey",
            required = false,
            description = "Device Key of the controller.")
    public void setControllerKey(String controllerKey) {
        this.controllerKey = Integer.parseInt(controllerKey);
    }

    /**
     * @param unitNumber the unitNumber to set
     */
    @Option(name = "unitnumber",
            required = false,
            description = "Unit number of the virtual machine.")
    public void setUnitNumber(String unitNumber) {
        this.unitNumber = Integer.parseInt(unitNumber);
    }

    /**
     * This method returns a boolean value specifying whether the Task is
     * succeeded or failed.
     *
     * @param task
     *            ManagedObjectReference representing the Task.
     * @return boolean value representing the Task result.
     * @throws InvalidCollectorVersionFaultMsg
     *
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

    /**
     * Creates the virtual storage object.
     *
     * @throws RuntimeFaultFaultMsg
     * @throws InvalidDatastoreFaultMsg
     * @throws FileFaultFaultMsg
     * @throws InvalidCollectorVersionFaultMsg
     * @throws InvalidPropertyFaultMsg
     * @throws NotFoundFaultMsg
     * @throws VmConfigFaultFaultMsg
     * @throws MissingControllerFaultMsg
     * @throws InvalidStateFaultMsg
     * @throws InvalidControllerFaultMsg
     * @throws DeviceUnsupportedForVmVersionFaultMsg
     *
     * @throws Exception
     *             the exception
     */
    void attachDiskToVM() throws InvalidPropertyFaultMsg, RuntimeFaultFaultMsg,
            FileFaultFaultMsg, InvalidDatastoreFaultMsg, NotFoundFaultMsg,
            InvalidControllerFaultMsg, InvalidStateFaultMsg,
            MissingControllerFaultMsg, VmConfigFaultFaultMsg,
            InvalidCollectorVersionFaultMsg,
            DeviceUnsupportedForVmVersionFaultMsg {
        // Get vStorageObjectManager Mor.
        ManagedObjectReference morVStrObjManager = connection
                .getServiceContent().getVStorageObjectManager();

        // Get Virtual Machine Mor.
        ManagedObjectReference morPropCol = connection.getServiceContent()
                .getPropertyCollector();
        ManagedObjectReference morVm = getMOREFs.vmByVMname(vmName, morPropCol);

        // We assume that the host managing the VM has access to datastore
        // containing the FCD.

        // Get all the input Mor's required for retrieving VStorageObject.
        ManagedObjectReference morDatastore = getMOREFs.inContainerByType(
                serviceContent.getRootFolder(), "Datastore").get(datastoreName);

        // Retrieve a vStorageObject:
        System.out.println("Operation: Retrieving a vStorageObject");
        VStorageObject retrievedVStrObj = vimPort.retrieveVStorageObject(
                morVStrObjManager, FcdHelper.makeId(vStorageObjectId),
                morDatastore);
        System.out.println("Success: Retrieved vStorageObject ::"
                + vStorageObjectId);
        System.out.println("Operation:  Attaching a given vStorageObject to"
                        + " the given virtualMachine.");
        ManagedObjectReference taskMorAttachDisk = vimPort.attachDiskTask(
                morVm, FcdHelper.makeId(vStorageObjectId), morDatastore,
                controllerKey, unitNumber);

        if (getTaskResultAfterDone(taskMorAttachDisk)) {
            System.out.printf(
                    "Success: Attached vStorageObjectId : [ Name = %s ,"
                            + " Id = %s ] to VM [ Name = %s ]%n",
                    retrievedVStrObj.getConfig().getName(), retrievedVStrObj
                            .getConfig().getId().getId(), vmName);
        } else {
            String msg = "Error: Attaching [ " + vStorageObjectId
                    + " ] to the VM [ " + vmName + " ] failed.";
            throw new RuntimeException(msg);
        }

        // Retrieve a vStorageObject based on the given vStorageObjectId and
        // verify virtualMachine is reflected as a new consumer in the
        // retrievedVStorageObject when a virtualMachine is reconfigured to ADD
        // a FCD.
        System.out.println("Operation: Retrieve the vStorageObjects in"
                + " datastore.");
        VStorageObject retrievedVStrObjWithConsumer = connection.getVimPort()
                .retrieveVStorageObject(morVStrObjManager,
                        FcdHelper.makeId(vStorageObjectId), morDatastore);
        if (retrievedVStrObjWithConsumer.getConfig().getId().getId()
                .equals(vStorageObjectId)) {
            if (retrievedVStrObjWithConsumer.
                    getConfig().getConsumerId().get(0) != null) {
                System.out.printf("Success: Retrieved vStorageObject :: %n" +
                                " [ Uuid = %s ] is associated with consumer" +
                                " [ ConsumerId = %s ]%n",
                                retrievedVStrObjWithConsumer.getConfig()
                                        .getId().getId(),
                                retrievedVStrObjWithConsumer.getConfig()
                                        .getConsumerId().get(0).getId());
            } else {
                String msg = "Error: Given vStorageObject [ "
                        + vStorageObjectId
                        + "] does not have a consumer attached to it.";
                throw new RuntimeException(msg);
            }
        } else {
            String msg = "Error: Given vStorageObject [ " + vStorageObjectId
                    + "] and retrieved VStorageObject are different.";
            throw new RuntimeException(msg);
        }
    }

    @Action
    public void run() throws InvalidPropertyFaultMsg, RuntimeFaultFaultMsg,
            FileFaultFaultMsg, InvalidDatastoreFaultMsg, NotFoundFaultMsg,
            InvalidControllerFaultMsg, InvalidStateFaultMsg,
            MissingControllerFaultMsg, VmConfigFaultFaultMsg,
            InvalidCollectorVersionFaultMsg,
            DeviceUnsupportedForVmVersionFaultMsg{
        attachDiskToVM();
    }
}
