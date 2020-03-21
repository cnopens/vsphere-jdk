/*
 * Copyright (2019, ) Institute of Software, Chinese Academy of Sciences
 */
package com.github.kubesys.impls;


import java.util.List;

import com.github.kubesys.ExtendedvSphereClient;
import com.vmware.vcenter.Network;
import com.vmware.vcenter.NetworkTypes.FilterSpec.Builder;
import com.vmware.vcenter.NetworkTypes.Summary;

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
public class VirtualMachineNetworkImpl extends AbstractImpl {

	protected Network networkService;
	
	public VirtualMachineNetworkImpl(ExtendedvSphereClient client) {
		super(client);
		this.networkService = client.getVapiAuthHelper().getStubFactory()
                    .createStub(Network.class, client.getSessionStubConfig());
	}
	
	public List<Summary> list() {
        return this.networkService.list(new Builder().build());
	}
	
}
