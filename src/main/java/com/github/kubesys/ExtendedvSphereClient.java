/*
 * Copyright (2019, ) Institute of Software, Chinese Academy of Sciences
 */
package com.github.kubesys;

import org.apache.log4j.Logger;

import com.github.kubesys.impls.VirtualMachineImpl;

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
public abstract class ExtendedvSphereClient {

	/**
	 * m_logger
	 */
	public final static Logger m_logger = Logger.getLogger(ExtendedvSphereClient.class.getName());
	

	protected final String[] args = new String[7];;
    
    public ExtendedvSphereClient(String server, String username, String password) {
		super();
		args[0] = "--server";
		args[1] = server;
		args[2] = "--username";
		args[3] = username;
		args[4] = "--password";
		args[5] = password;
		args[6] = "--skip-server-verification";
	}

	public String[] getArgs() {
		return args;
	}
	
	public VirtualMachineImpl virtualmachines() {
		return new VirtualMachineImpl(this);
	}


	public static void main(String[] args) {
//		ExtendedvSphereClient client = new ExtendedvSphereClient("https://133.133.135.35/sdk/vimService", "administrator@vsphere.test", "Onceas!234");
//		System.out.println(client.getConnection().getServiceContent().getAbout().getFullName());
	}
}
