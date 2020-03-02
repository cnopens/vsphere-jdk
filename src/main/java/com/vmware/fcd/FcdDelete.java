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
import com.vmware.vim25.TaskInProgressFaultMsg;
import com.vmware.vim25.TaskInfoState;
import com.vmware.vim25.VmConfigFaultFaultMsg;

/**
 * <pre>
 * FcdDelete
 *
 * This sample deletes a given virtual storage object.
 *
 * <b>Parameters:</b>
 * url                    [required] : url of the web service
 * username               [required] : username for the authentication
 * password               [required] : password for the authentication
 * vstorageobjectid       [required] : Uuid of the vstorageobject
 * datastorename          [required] : Name of the datastore which contains
 *                                     the virtual storage object
 * <b>Command Line:</b>
 * Attach a given virtual storage object to the given virtual machine.
 * run.bat com.vmware.vm.FcdAttachToVM --url [webserviceurl]
 * --username [username] --password [password]
 * --vstorageobjectid [vstorageobjectid] --datastorename [datastorename]
 * </pre>
 */
@Sample(name = "fcd-delete", description = "This sample deletes a virtual"
        + " storage object.")
public class FcdDelete extends ConnectedVimServiceBase {

    private String vStorageObjectId;
    private String datastoreName;

    /**
     * @param vStorageObjectId the vStorageObjectId to set
     */
    @Option(name = "vstorageobjectid",
            required = true,
            description = "Uuid of the vstorageobject.")
    public void setVStorageObjectId(String vStorageObjectId) {
        this.vStorageObjectId = vStorageObjectId;
    }

    /**
     * @param datastoreName the datastoreName to set
     */
    @Option(name = "datastorename",
            required = true,
            description = "Name of datastore containing the  vstorageobject.")
    public void setDatastoreName(String datastoreName) {
        this.datastoreName = datastoreName;
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
     * @throws TaskInProgressFaultMsg
     * @throws NotFoundFaultMsg
     * @throws VmConfigFaultFaultMsg
     * @throws MissingControllerFaultMsg
     * @throws InvalidStateFaultMsg
     * @throws InvalidControllerFaultMsg
     */
    void deleteVStorageObject() throws InvalidPropertyFaultMsg,
            RuntimeFaultFaultMsg, FileFaultFaultMsg, InvalidDatastoreFaultMsg,
            InvalidStateFaultMsg, NotFoundFaultMsg, TaskInProgressFaultMsg,
            InvalidCollectorVersionFaultMsg {
        // Get vStorageObjectManager Mor.
        ManagedObjectReference morVStrObjManager = connection
                .getServiceContent().getVStorageObjectManager();

        // Get all the input Mor's required for retrieving VStorageObject.
        ManagedObjectReference morDatastore = getMOREFs.inContainerByType(
                serviceContent.getRootFolder(), "Datastore")
                .get(datastoreName);

        // Retrieve a vStorageObject:
        System.out.println("Operation: Deleting the given vStorageObject");
        ManagedObjectReference deleteVStrObjTaskMor = vimPort
                .deleteVStorageObjectTask(morVStrObjManager,
                        FcdHelper.makeId(vStorageObjectId), morDatastore);
        if (getTaskResultAfterDone(deleteVStrObjTaskMor)) {
            System.out.printf(
                    "Success: Deleted vStorageObject :  %n [ Uuid = %s ]%n",
                    vStorageObjectId);
        } else {
            String msg = "Error: Deleting [ " + vStorageObjectId
                    + "] vStorageObject";
            throw new RuntimeException(msg);
        }
    }

    @Action
    public void run() throws InvalidPropertyFaultMsg, RuntimeFaultFaultMsg,
            FileFaultFaultMsg, InvalidDatastoreFaultMsg, InvalidStateFaultMsg,
            NotFoundFaultMsg, TaskInProgressFaultMsg,
            InvalidCollectorVersionFaultMsg {
        deleteVStorageObject();
    }
}
