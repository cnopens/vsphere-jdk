/*
 * Copyright (2019, ) Institute of Software, Chinese Academy of Sciences
 */
package com.github.kubesys.vsphere;

import java.util.Map;
import java.util.logging.Logger;

import com.github.kubesys.vsphere.impl.VirtualMachineClusterImpl;
import com.github.kubesys.vsphere.impl.VirtualMachineDiskImageImpl;
import com.github.kubesys.vsphere.impl.VirtualMachineDiskImpl;
import com.github.kubesys.vsphere.impl.VirtualMachineDiskSnapshotImpl;
import com.github.kubesys.vsphere.impl.VirtualMachineImageImpl;
import com.github.kubesys.vsphere.impl.VirtualMachineImpl;
import com.github.kubesys.vsphere.impl.VirtualMachineNetworkImpl;
import com.github.kubesys.vsphere.impl.VirtualMachinePoolImpl;
import com.github.kubesys.vsphere.impl.VirtualMachineSnapshotImpl;
import com.vmware.connection.BasicConnection;
import com.vmware.connection.Connection;
import com.vmware.connection.helpers.GetMOREF;
import com.vmware.connection.helpers.WaitForValues;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.ServiceContent;
import com.vmware.vim25.VimPortType;

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
public class ExtendedvSphereClient {

	/**
	 * m_logger
	 */
	public final static Logger m_logger = Logger.getLogger(ExtendedvSphereClient.class.getName());

	protected final Connection connection; 
	
    protected VimPortType vimPort;
    
    protected ServiceContent serviceContent;
    
    protected ManagedObjectReference rootRef;
    @SuppressWarnings("rawtypes")
    protected Map headers;
    protected WaitForValues waitForValues;
    protected GetMOREF getMOREFs;
	
	public ExtendedvSphereClient(String url, String username, String password) {
		super();
		connection = new BasicConnection();
        init(url, username, password);
	}

	protected void init(String url, String username, String password) {
		connection.setUrl(url);
        connection.setUsername(username);
        connection.setPassword(password);
        connection.connect();
        this.waitForValues = new WaitForValues(connection);
        this.getMOREFs = new GetMOREF(connection);
        this.headers = connection.getHeaders();
        this.vimPort = connection.getVimPort();
        this.serviceContent = connection.getServiceContent();
        this.rootRef = serviceContent.getRootFolder();
	}
	
	public void close() throws Exception {
		this.waitForValues = null;
		try {
			connection.disconnect();
		} catch (Throwable t) {
			throw new Exception(t);
		}
	}
	
	public VirtualMachineClusterImpl virtualMachineClusters() {
		return new VirtualMachineClusterImpl(this);
	}
	
	/**
	 * the same as  'virtualMachines'
	 * 
	 * @return                    virtualMachines
	 */
	public VirtualMachineImpl virtualMachines() {
		return new VirtualMachineImpl(this);
	}
	
	/**
	 * the same as  'virtualMachineDisks'
	 * 
	 * @return                    virtualMachineDisks
	 */
	public VirtualMachineDiskImpl virtualMachineDisks() {
		return new VirtualMachineDiskImpl(this);
	}
	
	/**
	 * the same as  'virtualMachineDiskSnapshots'
	 * 
	 * @return                    virtualMachineDiskSnapshots
	 */
	public VirtualMachineDiskSnapshotImpl virtualMachineDiskSnapshots() {
		return new VirtualMachineDiskSnapshotImpl(this);
	}
	
	/**
	 * the same as  'virtualMachineImages'
	 * 
	 * @return                    virtualMachineImages
	 */
	public VirtualMachineImageImpl virtualMachineImages() {
		return new VirtualMachineImageImpl(this);
	}
	
	/**
	 * the same as  'virtualMachineSnapshots'
	 * 
	 * @return                    virtualMachineSnapshots
	 */
	public VirtualMachineSnapshotImpl virtualMachineSnapshots() {
		return new VirtualMachineSnapshotImpl(this);
	}
	
	/**
	 * the same as  'virtualMachinePools'
	 * 
	 * @return                    virtualMachinePools
	 */
	public VirtualMachinePoolImpl virtualMachinePools() {
		return new VirtualMachinePoolImpl(this);
	}
	
	/**
	 * the same as  'virtualMachineDiskImages'
	 * 
	 * @return                    virtualMachineDiskImages
	 */
	public VirtualMachineDiskImageImpl virtualMachineDiskImages() {
		return new VirtualMachineDiskImageImpl(this);
	}
	
	/**
	 * the same as  'virtualMachineNetworks'
	 * 
	 * @return                    virtualMachineNetworks
	 */
	public VirtualMachineNetworkImpl virtualMachineNetworks() {
		return new VirtualMachineNetworkImpl(this);
	}

}
