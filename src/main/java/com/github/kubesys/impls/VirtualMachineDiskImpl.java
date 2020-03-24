/*
 * Copyright (2019, ) Institute of Software, Chinese Academy of Sciences
 */
package com.github.kubesys.impls;

import java.util.List;

import com.github.kubesys.ExtendedvSphereClient;
import com.github.kubesys.utils.ConvertorUtils;
import com.vmware.vcenter.vm.hardware.Disk;
import com.vmware.vcenter.vm.hardware.DiskTypes.CreateSpec;
import com.vmware.vcenter.vm.hardware.DiskTypes.Info;

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
public class VirtualMachineDiskImpl extends AbstractImpl {

	protected Disk diskService;
	
	public VirtualMachineDiskImpl(ExtendedvSphereClient client) {
		super(client);
		this.diskService = client.getVapiAuthHelper().getStubFactory().createStub(Disk.class,
				client.getSessionStubConfig());
	}

	public List<com.vmware.vcenter.vm.hardware.DiskTypes.Summary> list(String vmId) {
		return this.diskService.list(vmId);
	}
	
	public Info get(String vmid, String diskId) {
		return this.diskService.get(vmid, diskId);
	}

}
