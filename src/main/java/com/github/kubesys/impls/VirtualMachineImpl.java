/*
 * Copyright (2019, ) Institute of Software, Chinese Academy of Sciences
 */
package com.github.kubesys.impls;

import java.util.List;

import com.github.kubesys.ExtendedvSphereClient;
import com.vmware.vcenter.VM;
import com.vmware.vcenter.VMTypes.Summary;
import com.vmware.vcenter.VMTypes.FilterSpec.Builder;

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
	
	public VirtualMachineImpl(ExtendedvSphereClient client) {
		super(client);
		this.vmService = client.getVapiAuthHelper().getStubFactory()
                    .createStub(VM.class, client.getSessionStubConfig());
	}
	
	public void list() {
		Builder bldr = new Builder();
        List<Summary> vmList = this.vmService.list(bldr.build());
        System.out.println("----------------------------------------");
        System.out.println("List of VMs");
        for (Summary vmSummary : vmList) {
            System.out.println(vmSummary);
        }
        System.out.println("----------------------------------------");
	}
	
}
