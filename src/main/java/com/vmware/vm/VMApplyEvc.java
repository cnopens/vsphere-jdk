/*
 * ******************************************************
 * Copyright VMware, Inc. 2017.  All Rights Reserved.
 * ******************************************************
 *
 * DISCLAIMER. THIS PROGRAM IS PROVIDED TO YOU "AS IS" WITHOUT
 * WARRANTIES OR CONDITIONS # OF ANY KIND, WHETHER ORAL OR WRITTEN,
 * EXPRESS OR IMPLIED. THE AUTHOR SPECIFICALLY # DISCLAIMS ANY IMPLIED
 * WARRANTIES OR CONDITIONS OF MERCHANTABILITY, SATISFACTORY # QUALITY,
 * NON-INFRINGEMENT AND FITNESS FOR A PARTICULAR PURPOSE.
 */

package com.vmware.vm;

import com.vmware.common.annotations.Action;
import com.vmware.common.annotations.Option;
import com.vmware.common.annotations.Sample;
import com.vmware.connection.ConnectedVimServiceBase;
import com.vmware.vim25.*;

import java.rmi.RemoteException;
import java.util.*;

/**
 * <pre>
 * VMApplyEvc
 *
 * This sample makes applies a Per-VM EVC setting to an existing VM.
 *
 * <b>Parameters:</b>
 * url             [required] : url of the web service
 * username        [required] : username for the authentication
 * password        [required] : password for the authentication
 * vmpath          [optional] : inventory path of the VM
 * list            [optional] : list the EVC modes only
 * evc-key         [optional] : Key to apply. If unset, will remove the mode.
 *
 * <b>Command Line:</b>
 * java com.vmware.vm.VMApplyEvc --url [webserviceurl]
 * --username [username] --password [password]
 * --vmpath [vmPath] --evc-key [EVC key] --list
 * </pre>
 */
@Sample(name = "vm-apply-evc",
        description = "This sample applies a Per-VM EVC setting to an existing VM.")
public class VMApplyEvc extends ConnectedVimServiceBase {

    private String vmPathName;
    private String evcKey;
    private Boolean listModes = false;

    @Option(name = "vmpath", required = false,
            description = "inventory path of the VM")
    public void setVmPathName(String vmPathName) {
        this.vmPathName = vmPathName;
    }

    @Option(name = "evc-key", required = false,
            description = "Key of the EVC mode")
    public void setEvcKey(String evcKey) {
        this.evcKey = evcKey;
    }

    @Option(name = "list", required = false, parameter = false,
            description = "List only")
    public void setList(final Boolean flag) {
        this.listModes = flag;
    }

    /**
     * This method returns a boolean value specifying whether the Task is
     * succeeded or failed.
     *
     * @param task ManagedObjectReference representing the Task.
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
        Object[] result =
                waitForValues.wait(task, new String[]{"info.state",
                                                      "info.error"},
                        new String[]{"state"}, new Object[][]{new Object[]{
                        TaskInfoState.SUCCESS, TaskInfoState.ERROR}});

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
     * This method returns a single property of a managed object.
     *
     * @param mor ManagedObjectReference representing the Managed Object.
     * @param property String property to retrieve.
     * @return Data object requested.
     * @throws InvalidCollectorVersionFaultMsg
     * @throws RuntimeFaultFaultMsg
     * @throws InvalidPropertyFaultMsg
     */
    Object getDynamicProperty(ManagedObjectReference mor,
                              String property)
                              throws InvalidPropertyFaultMsg,
                                     RuntimeFaultFaultMsg,
                                     InvalidCollectorVersionFaultMsg {
        String[] capabilityProp = new String[]{property};
        PropertyFilterSpec filterSpec = waitForValues.propertyFilterSpec(
            mor, new String[]{property});
        RetrieveResult rslts =
            vimPort.retrievePropertiesEx(serviceContent.getPropertyCollector(),
                                         Arrays.asList(filterSpec),
                                         new RetrieveOptions());
        if (rslts.getObjects().size() == 1 &&
            rslts.getObjects().get(0).getPropSet().size() == 1) {
            return rslts.getObjects().get(0).getPropSet().get(0).getVal();
        }
        throw new RuntimeException("Failed to fetch " + property);
    }

    /**
     * Returns a list of EVC Modes supported by the vCenter Server.
     *
     * @return List of EVCMode
     * @throws InvalidCollectorVersionFaultMsg
     * @throws RuntimeFaultFaultMsg
     * @throws InvalidPropertyFaultMsg
     */
    List<EVCMode> getEvcModes() throws InvalidPropertyFaultMsg,
                                       RuntimeFaultFaultMsg,
                                       InvalidCollectorVersionFaultMsg {
        ManagedObjectReference siMor = getServiceInstanceReference();
        Capability cap = (Capability)getDynamicProperty(siMor, "capability");
        return cap.getSupportedEVCMode();
    }

    /**
     * Returns whether Per-VM EVC is supported by the VirtualMachine.
     * It might not be supported if virtual hardware version is too old.
     *
     * @param mor ManagedObjectReference representing the VirtualMachine.
     * @return boolean value of support
     * @throws InvalidCollectorVersionFaultMsg
     * @throws RuntimeFaultFaultMsg
     * @throws InvalidPropertyFaultMsg
     */
    boolean isPerVmEvcSupported(ManagedObjectReference mor)
                              throws InvalidPropertyFaultMsg,
                                     RuntimeFaultFaultMsg,
                                     InvalidCollectorVersionFaultMsg {
        VirtualMachineCapability cap =
             (VirtualMachineCapability)getDynamicProperty(mor, "capability");

        // The property might be null. Check that first.
        if (cap.isPerVmEvcSupported() != null) {
            return cap.isPerVmEvcSupported();
        }
        return false;
    }

    /**
     * Apply Per-VM EVC Mode to a VM.
     *
     * @throws RuntimeFaultFaultMsg
     * @throws InvalidCollectorVersionFaultMsg
     * @throws RuntimeFaultFaultMsg
     * @throws InvalidStateFaultMsg
     * @throws InvalidPropertyFaultMsg
     */
    void applyEvcModeVm() throws RuntimeFaultFaultMsg,
                                 InvalidStateFaultMsg, InvalidPropertyFaultMsg,
                                 InvalidCollectorVersionFaultMsg {
        if (vmPathName == null) {
            System.out.println("--vmpath must be specified unless " +
                               "--list is set.");
            return;
        }

        ManagedObjectReference vmRef =
                vimPort.findByInventoryPath(serviceContent.getSearchIndex(),
                        vmPathName);
        if (vmRef == null) {
            System.out.format("The VMPath specified [ %s ] is not found.",
                              vmPathName);
            return;
        }

        boolean perVmEvcSupported = isPerVmEvcSupported(vmRef);
        if (!perVmEvcSupported) {
            System.out.println("Per-VM EVC is not supported for this " +
                               "virtual hardware version.");
            return;
        }

        List<HostFeatureMask> masks = null;
        if (evcKey != null) { // Removing EVC settings is easier.
            List<EVCMode> evcModes = getEvcModes();
            for (EVCMode evcMode : evcModes) {
                if (evcMode.getKey().equals(evcKey)) {
                    masks = evcMode.getFeatureMask();
                    break;
                }
            }
            if (masks == null) {
                System.out.format("Failed to find EVC mode with key %s",
                                  evcKey);
                return;
            }
        }
        ManagedObjectReference applyTask =
            vimPort.applyEvcModeVMTask(vmRef, masks, true);

        String evcKeyString = evcKey == null ? "none" : evcKey;
        String successString = getTaskResultAfterDone(applyTask)
                                   ? "Successfully applied"
                                   : "Failed to apply";
        System.out.format("%s EVC mode to [%s]", successString, evcKeyString);
    }

    /**
     * List the EVC Mode keys that vCenter Server supports.
     *
     * @throws InvalidCollectorVersionFaultMsg
     * @throws RuntimeFaultFaultMsg
     * @throws InvalidPropertyFaultMsg
     */
    void list() throws InvalidCollectorVersionFaultMsg, RuntimeFaultFaultMsg,
                       InvalidPropertyFaultMsg {
        List<EVCMode> evcModes = getEvcModes();
        System.out.println("EVC modes");
        System.out.println("---------");
        for (EVCMode mode : evcModes) {
            System.out.println(mode.getKey());
        }
    }

    @Action
    public void run() throws RuntimeFaultFaultMsg, InvalidStateFaultMsg,
                             InvalidCollectorVersionFaultMsg,
                             InvalidPropertyFaultMsg {
        if (listModes) {
            list();
        } else {
            applyEvcModeVm();
        }
    }
}
