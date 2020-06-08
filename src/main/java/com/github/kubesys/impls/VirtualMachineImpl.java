/*
 * Copyright (2019, ) Institute of Software, Chinese Academy of Sciences
 */
package com.github.kubesys.impls;

import java.util.List;

import com.github.kubesys.ExtendedvSphereClient;
import com.github.kubesys.models.CreateAndStartVMFromISO;
import com.github.kubesys.models.PlugDisk;
import com.github.kubesys.models.PlugNIC;
import com.github.kubesys.models.UnplugDisk;
import com.github.kubesys.utils.ConvertorUtils;
import com.vmware.vcenter.VM;
import com.vmware.vcenter.VMTypes;
import com.vmware.vcenter.VMTypes.FilterSpec.Builder;
import com.vmware.vcenter.VMTypes.Info;
import com.vmware.vcenter.VMTypes.Summary;
import com.vmware.vcenter.vm.Power;
import com.vmware.vcenter.vm.hardware.Cpu;
import com.vmware.vcenter.vm.hardware.CpuTypes;
import com.vmware.vcenter.vm.hardware.Disk;
import com.vmware.vcenter.vm.hardware.Ethernet;
import com.vmware.vcenter.vm.hardware.Memory;
import com.vmware.vcenter.vm.hardware.MemoryTypes;

import vmware.samples.vcenter.helpers.VmHelper;

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
public class VirtualMachineImpl extends AbstractImpl {

	protected VM vmService;

	protected Power vmPowerService;
	
	protected Disk diskService;

	protected Cpu cpuService;

	protected Memory memoryService;
	
	protected Ethernet ethernetService;

	public VirtualMachineImpl(ExtendedvSphereClient client) {
		super(client);
		this.vmService = client.getVapiAuthHelper().getStubFactory().createStub(VM.class,
				client.getSessionStubConfig());
		this.vmPowerService = client.getVapiAuthHelper().getStubFactory().createStub(Power.class,
				client.getSessionStubConfig());
		this.diskService = client.getVapiAuthHelper().getStubFactory().createStub(Disk.class,
				client.getSessionStubConfig());
		this.cpuService = client.getVapiAuthHelper().getStubFactory().createStub(Cpu.class,
				client.getSessionStubConfig());
		this.memoryService = client.getVapiAuthHelper().getStubFactory().createStub(Memory.class,
				client.getSessionStubConfig());
		this.ethernetService = client.getVapiAuthHelper().getStubFactory().createStub(Ethernet.class,
				client.getSessionStubConfig());
		
	}

	public List<Summary> list() {
		return this.vmService.list(new Builder().build());
	}

	public boolean stopVM(String name) {
		this.vmPowerService.stop(getVMId(name));
		return true;
	}

	public boolean stopVMById(String id) {
		this.vmPowerService.stop(id);
		return true;
	}

	public boolean startVM(String name) {
		this.vmPowerService.start(getVMId(name));
		return true;
	}

	public boolean startVMById(String id) {
		this.vmPowerService.start(id);
		return true;
	}

	public boolean resetVM(String name) {
		this.vmPowerService.reset(getVMId(name));
		return true;
	}

	public boolean resetVMById(String id) {
		this.vmPowerService.reset(id);
		return true;
	}

	public boolean suspendVM(String name) {
		this.vmPowerService.suspend(getVMId(name));
		return true;
	}

	public boolean suspendVMById(String id) {
		this.vmPowerService.suspend(id);
		return true;
	}

	public Info getVM(String name) {
		return this.vmService.get(getVMId(name));
	}

	public Info getVMById(String id) {
		return this.vmService.get(id);
	}

	public boolean createAndStartVMFromISO(String name, String datacenterName, String clusterName, String datastoreName,
			String hostName, String vmFolderName, CreateAndStartVMFromISO createAndStartVMFromISO) throws Exception {
		VMTypes.CreateSpec vmCreateSpec = new VMTypes.CreateSpec.Builder(createAndStartVMFromISO.getOs_variant())
				.setName(name).setBootDevices(ConvertorUtils.toBoots(createAndStartVMFromISO.getBoot()))
				.setCpu(ConvertorUtils.toCPUs(createAndStartVMFromISO.getVcpus()))
				.setMemory(ConvertorUtils.toRAMs(createAndStartVMFromISO.getMemory()))
				.setPlacement(ConvertorUtils.toPlacement(client, hostName, clusterName, datacenterName, vmFolderName,
						datastoreName))
				.setNics(ConvertorUtils.toNICs(client, datacenterName, createAndStartVMFromISO.getNetwork()))
				.setDisks(ConvertorUtils.toDisks(createAndStartVMFromISO.getDisk()))
				.setCdroms(ConvertorUtils.toCDRom(createAndStartVMFromISO.getCdrom())).build();
		String basicVMId = vmService.create(vmCreateSpec);
		startVMById(basicVMId);
		return true;
	}

	protected String getVMId(String name) {
		return VmHelper.getVM(client.getVapiAuthHelper().getStubFactory(), client.getSessionStubConfig(), name);
	}

	public String plugDisk(String vmid, PlugDisk disk) {
		List<com.vmware.vcenter.vm.hardware.DiskTypes.CreateSpec> disks = ConvertorUtils.toDisks(disk.getDisk() + ",size=" + disk.getSize());
		return this.diskService.create(vmid, disks.get(0));
	}
	
	public String plugDisk(String vmid, String disk) {
		List<com.vmware.vcenter.vm.hardware.DiskTypes.CreateSpec> disks = ConvertorUtils.toDisks(disk);
		return this.diskService.create(vmid, disks.get(0));
	}
	
	public String plugNIC(String vmid, PlugNIC nic) {
		List<com.vmware.vcenter.vm.hardware.EthernetTypes.CreateSpec> disks = ConvertorUtils.toNICs(nic.getDisk() + ",size=" + nic.getSize());
		return this.ethernetService.create(vmid, disks.get(0));
	}

	public boolean deleteDisk(UnplugDisk disk) {
		this.diskService.delete(disk.getVmid(), disk.getDiskid());
		return true;
	}
	
	public boolean deleteDisk(String vmid, String diskId) {
		this.diskService.delete(vmid, diskId);
		return true;
	}
	
	public boolean cloneVM(String vmid, String cloneName) {
//		VMTypes.CloneSpec cloneSpec = new VMTypes.DiskCloneSpec().;
//		this.vmService.clone(cloneSpec);
		return true;
	}

	public boolean setCPU(String vmid, Long cpuCount) {
		// CPU UpdateSpec, for example 1l
		CpuTypes.UpdateSpec cpuUpdateSpec =
				new CpuTypes.UpdateSpec.Builder().setCoresPerSocket(1l)
						.setCount(cpuCount)
						.setHotAddEnabled(true)
						.setHotRemoveEnabled(true)
						.build();

		cpuService.update(vmid, cpuUpdateSpec);
		return true;
	}

	public boolean setMemory(String vmid, Long memoryCount) {
		// Memory UpdateSpec, for example 2 * 1024l
		MemoryTypes.UpdateSpec memoryUpdateSpec =
				new MemoryTypes.UpdateSpec.Builder().setSizeMiB(memoryCount)
						.setHotAddEnabled(true)
						.build();
		memoryService.update(vmid, memoryUpdateSpec);
		return true;
	}
}
