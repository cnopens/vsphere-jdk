/*
 * Copyright (2019, ) Institute of Software, Chinese Academy of Sciences
 */
package com.github.kubesys.impls;

import com.github.kubesys.ExtendedvSphereClient;
import com.vmware.vcenter.vm_template.LibraryItems;

/**
 * @author wuheng@otcaix.iscas.ac.cn
 * 
 * @version 1.0.0
 * @since 2019/9/3
 *
 *        <code>ExtendedKubernetesClient<code> extends
 *        <code>DefaultKubernetesClient<code> to provide the lifecycle of
 *        VirtualMachine, VirtualMachinePool, VirtualMachineDisk,
 *        VirtualMachineImage, VirtualMachineSnapshot, VirtualMachineNetwork
 * 
 */
public class VirtualMachineImageImpl extends AbstractImpl {

	protected LibraryItems templateService;

	public VirtualMachineImageImpl(ExtendedvSphereClient client) {
		super(client);
		this.templateService = client.getVapiAuthHelper().getStubFactory().createStub(LibraryItems.class,
				client.getSessionStubConfig());
		
	}

	public com.vmware.vcenter.vm_template.LibraryItemsTypes.Info getTemplate(String name) {
		return this.templateService.get(name);
	}

}
