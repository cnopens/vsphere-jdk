/*
 * Copyright (2019, ) Institute of Software, Chinese Academy of Sciences
 */
package com.github.kubesys.impls;

import java.util.List;

import com.github.kubesys.ExtendedvSphereClient;
import com.vmware.vcenter.VM;
import com.vmware.vcenter.VMTypes.Summary;
import com.vmware.vcenter.VMTypes.FilterSpec.Builder;
import com.vmware.vcenter.vm.Power;

import vmware.samples.vcenter.helpers.VmHelper;

/**
 * @author wuheng@otcaix.iscas.ac.cn
 * 
 * @version 1.0.0
 * @since   2019/9/3
 *
 * <code>ExtendedKubernetesClient<code> extends <code>DefaultKubernetesClient<code>
 * to provide the lifecycle of VirtualMachine, VirtualMachinePool, VirtualMachineDisk,
 * VirtualMachineImage, VirtualMachineSnapshot, VirtualMachineNetwork
 * 
 */
public class VirtualMachineImpl extends AbstractImpl {

	protected VM vmService;
	
	protected Power vmPowerService;
	
	public VirtualMachineImpl(ExtendedvSphereClient client) {
		super(client);
		this.vmService = client.getVapiAuthHelper().getStubFactory()
                    .createStub(VM.class, client.getSessionStubConfig());
		 this.vmPowerService = client.getVapiAuthHelper().getStubFactory()
				 	.createStub(Power.class, client.getSessionStubConfig()); 
	}
	
	public List<Summary> list() {
        return this.vmService.list(new Builder().build());
	}
	
	public boolean stopVM(String name) {
		this.vmPowerService.stop(getVMId(name));
        return true;
	}
	
	public boolean startVM(String name) {
		this.vmPowerService.start(getVMId(name));
        return true;
	}
	
	public boolean resetVM(String name) {
		this.vmPowerService.reset(getVMId(name));
        return true;
	}
	
	public boolean suspendVM(String name) {
		this.vmPowerService.suspend(getVMId(name));
        return true;
	}
	
	protected String getVMId(String name) {
		String vmId = VmHelper.getVM(client.getVapiAuthHelper().getStubFactory(),
				client.getSessionStubConfig(), name);
		return vmId;
	}
	
}
