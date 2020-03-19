/*
 * Copyright (2019, ) Institute of Software, Chinese Academy of Sciences
 */
package com.github.kubesys.vsphere.impl;

import com.github.kubesys.vsphere.ExtendedvSphereClient;

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
public class VirtualMachineDiskSnapshotImpl extends AbstractImpl {

	public VirtualMachineDiskSnapshotImpl(ExtendedvSphereClient client) {
		super(client);
	}
	
	
}
