/*
 * Copyright (2019, ) Institute of Software, Chinese Academy of Sciences
 */
package com.github.kubesys.impls;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.github.kubesys.ExtendedvSphereClient;
import com.vmware.vcenter.Cluster;
import com.vmware.vcenter.Datacenter;
import com.vmware.vcenter.Datastore;
import com.vmware.vcenter.Deployment;
import com.vmware.vcenter.Folder;
import com.vmware.vcenter.Host;
import com.vmware.vcenter.ResourcePool;

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
public class VirtualMachinePoolImpl extends AbstractImpl {

	protected Datacenter datacneterService;

	protected Cluster clusterService;
	
	protected Datastore datastoreService;
	
	protected Host hostService;
	
	protected Folder folderService;
	
	protected ResourcePool resourcePoolService;
	
	protected Deployment deploymentService;
	
	public VirtualMachinePoolImpl(ExtendedvSphereClient client) {
		super(client);
		this.datacneterService = client.getVapiAuthHelper().getStubFactory().createStub(Datacenter.class,
				client.getSessionStubConfig());
		this.clusterService = client.getVapiAuthHelper().getStubFactory().createStub(Cluster.class,
				client.getSessionStubConfig());
		this.datastoreService = client.getVapiAuthHelper().getStubFactory().createStub(Datastore.class,
				client.getSessionStubConfig());
		this.hostService = client.getVapiAuthHelper().getStubFactory().createStub(Host.class,
				client.getSessionStubConfig());
		this.folderService = client.getVapiAuthHelper().getStubFactory().createStub(Folder.class,
				client.getSessionStubConfig());
		this.resourcePoolService  = client.getVapiAuthHelper().getStubFactory().createStub(ResourcePool.class,
				client.getSessionStubConfig());
		this.deploymentService  = client.getVapiAuthHelper().getStubFactory().createStub(Deployment.class,
				client.getSessionStubConfig());
	}

	public List<com.vmware.vcenter.DatacenterTypes.Summary> listDataCeneters() {
		com.vmware.vcenter.DatacenterTypes.FilterSpec.Builder brdl = new com.vmware.vcenter.DatacenterTypes.FilterSpec.Builder();
		return this.datacneterService.list(brdl.build());
	}
	
	public com.vmware.vcenter.DatacenterTypes.Info getDataCeneter(String name) {
		return this.datacneterService.get(name);
	}

	public List<com.vmware.vcenter.ClusterTypes.Summary> listClusters() {
		com.vmware.vcenter.ClusterTypes.FilterSpec.Builder brdl = new com.vmware.vcenter.ClusterTypes.FilterSpec.Builder();
		return this.clusterService.list(brdl.build());
	}
	
	public com.vmware.vcenter.ClusterTypes.Info getCluster(String name) {
		return this.clusterService.get(name);
	}
	
	public List<com.vmware.vcenter.DatastoreTypes.Summary> listDatastores() {
		com.vmware.vcenter.DatastoreTypes.FilterSpec.Builder brdl = new com.vmware.vcenter.DatastoreTypes.FilterSpec.Builder();
		return this.datastoreService.list(brdl.build());
	}
	
	public com.vmware.vcenter.DatastoreTypes.Info getDatastore(String name) {
		return this.datastoreService.get(name);
	}
	
	public List<com.vmware.vcenter.HostTypes.Summary> listHosts() {
		com.vmware.vcenter.HostTypes.FilterSpec.Builder brdl = new com.vmware.vcenter.HostTypes.FilterSpec.Builder();
		return this.hostService.list(brdl.build());
	}
	
	public List<com.vmware.vcenter.HostTypes.Summary> listHosts(String cluster) {
		com.vmware.vcenter.HostTypes.FilterSpec.Builder brdl = new com.vmware.vcenter.HostTypes.FilterSpec.Builder();
		Set<String> names = new HashSet<String>();
		names.add(cluster);
		return this.hostService.list(brdl.setClusters(names).build());
	}
	
	public List<com.vmware.vcenter.FolderTypes.Summary> listFolders() {
		com.vmware.vcenter.FolderTypes.FilterSpec.Builder brdl = new com.vmware.vcenter.FolderTypes.FilterSpec.Builder();
		return this.folderService.list(brdl.build());
	}
	
	public List<com.vmware.vcenter.ResourcePoolTypes.Summary> listPools() {
		com.vmware.vcenter.ResourcePool.FilterSpec.Builder brdl = new com.vmware.vcenter.ResourcePool.FilterSpec.Builder();
		return this.resourcePoolService.list(brdl.build());
	}
	
	public com.vmware.vcenter.ResourcePoolTypes.Info getPool(String id) {
		return this.resourcePoolService.get(id);
	}
	
}
