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
import com.vmware.vim25.InvalidPropertyFaultMsg;
import com.vmware.vim25.InvalidStateFaultMsg;
import com.vmware.vim25.LocalizedMethodFault;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.NotFoundFaultMsg;
import com.vmware.vim25.RuntimeFaultFaultMsg;
import com.vmware.vim25.TaskInfoState;
import com.vmware.vim25.VmConfigFaultFaultMsg;

/**
 * <pre>
 * FcdDetachFromVM
 *
 * This sample detaches a given virtual storage object from the given virtual
 * machine.
 *
 * <b>Parameters:</b>
 * url                    [required] : url of the web service
 * username               [required] : username for the authentication
 * password               [required] : password for the authentication
 * vstorageobjectid       [required] : Uuid of the disk
 * vmname                 [required] : Name of the virtual machine
 *
 * <b>Command Line:</b>
 * Detach a currently attached virtual storage object from the given virtual
 * machine.
 * run.bat com.vmware.vm.FcdDetachFromVM --url [webserviceurl]
 * --username [username] --password [password]
 * --vstorageobjectid [vstorageobjectid] --vmname [vmname]
 * </pre>
 */
@Sample(name = "fcd-detachfromvm",description = "This sample detaches a"
        + " currently attached virtual storage object(FCD) from the given"
        + " virtual machine.")
public class FcdDetachFromVM extends ConnectedVimServiceBase {

    private String vStorageObjectId;
    private String vmName;

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
     * @param vmName the vmName to set
     */
    @Option(name = "vmname",
            required = true,
            description = "Name of virtual machine.")
    public void setVmName(String vmName) {
        this.vmName = vmName;
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

    /**
     * Creates the virtual storage object.
     *
     * @throws RuntimeFaultFaultMsg
     * @throws InvalidPropertyFaultMsg
     * @throws InvalidCollectorVersionFaultMsg
     * @throws FileFaultFaultMs
     * @throws InvalidStateFaultMsg
     * @throws NotFoundFaultMsg
     * @throws VmConfigFaultFaultMsg
     */
    void attachDiskToVM() throws InvalidPropertyFaultMsg, RuntimeFaultFaultMsg,
            InvalidCollectorVersionFaultMsg, FileFaultFaultMsg,
            InvalidStateFaultMsg, NotFoundFaultMsg, VmConfigFaultFaultMsg {
        // Get Virtual Machine Mor.
        ManagedObjectReference morPropCol = connection.getServiceContent()
                .getPropertyCollector();
        ManagedObjectReference morVm = getMOREFs.vmByVMname(vmName, morPropCol);

        System.out
                .println("Operation:  Attaching a given vStorageObject to the" +
                        " given virtualMachine.");
        ManagedObjectReference taskMorDetachDisk = vimPort.detachDiskTask(
                morVm, FcdHelper.makeId(vStorageObjectId));
        if (getTaskResultAfterDone(taskMorDetachDisk)) {
            System.out.printf("Success: Detached vStorageObjectId :"
                              + " [ Id = %s ] from VM [ Name = %s ]%n",
                             vStorageObjectId,
                             vmName);
        } else {
            String msg = "Error: Detaching [ " + vStorageObjectId
                    + " ] from the VM [ " + vmName + " ] failed.";
            throw new RuntimeException(msg);
        }
    }

    @Action
    public void run() throws InvalidPropertyFaultMsg, RuntimeFaultFaultMsg,
            InvalidCollectorVersionFaultMsg, FileFaultFaultMsg,
            InvalidStateFaultMsg, NotFoundFaultMsg, VmConfigFaultFaultMsg {
        attachDiskToVM();
    }
}
