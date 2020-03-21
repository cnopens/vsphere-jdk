/*

 * Copyright (2019, ) Institute of Software, Chinese Academy of Sciences
 */
package com.github.kubesys.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.github.kubesys.ExtendedvSphereClient;
import com.vmware.vcenter.VMTypes;
import com.vmware.vcenter.vm.hardware.CdromTypes;
import com.vmware.vcenter.vm.hardware.CpuTypes;
import com.vmware.vcenter.vm.hardware.DiskTypes;
import com.vmware.vcenter.vm.hardware.DiskTypes.VmdkCreateSpec;
import com.vmware.vcenter.vm.hardware.EthernetTypes;
import com.vmware.vcenter.vm.hardware.EthernetTypes.BackingType;
import com.vmware.vcenter.vm.hardware.MemoryTypes;
import com.vmware.vcenter.vm.hardware.boot.DeviceTypes;

import vmware.samples.vcenter.helpers.NetworkHelper;
import vmware.samples.vcenter.helpers.PlacementHelper;

/**
 * @author wuheng@otcaix.iscas.ac.cn
 * 
 * @version 1.2.0
 * @since 2019/9/3
 *
 */
public class ConvertorUtils {

	private static final long GB = 1024 * 1024 * 1024;

	public static List<com.vmware.vcenter.vm.hardware.DiskTypes.CreateSpec> toDisks(String disksStr) {
		List<com.vmware.vcenter.vm.hardware.DiskTypes.CreateSpec> list = new ArrayList<com.vmware.vcenter.vm.hardware.DiskTypes.CreateSpec>();
		for (String diskDesc : disksStr.split("--disk")) {
			com.vmware.vcenter.vm.hardware.DiskTypes.CreateSpec.Builder disk = new com.vmware.vcenter.vm.hardware.DiskTypes.CreateSpec.Builder();
			com.vmware.vcenter.vm.hardware.DiskTypes.VmdkCreateSpec.Builder newVmdk = new com.vmware.vcenter.vm.hardware.DiskTypes.VmdkCreateSpec.Builder();
			String[] descs = diskDesc.trim().split(",");
			newVmdk.setName(descs[0]);
			if (descs[1].trim().startsWith("size=")) {
				newVmdk.setCapacity(GB * Long.parseLong(descs[1].split("=")[1].trim()));
			}
			disk.setNewVmdk(newVmdk.build());
			list.add(disk.build());
		}
		return list;
	}

	public static List<com.vmware.vcenter.vm.hardware.EthernetTypes.CreateSpec> toNICs(ExtendedvSphereClient client,
			String datacenterName, String nicsStr) {

		String standardNetworkBacking = NetworkHelper.getStandardNetworkBacking(
				client.getVapiAuthHelper().getStubFactory(), client.getSessionStubConfig(), datacenterName,
				getSwitch(nicsStr));

		List<com.vmware.vcenter.vm.hardware.EthernetTypes.CreateSpec> list = new ArrayList<com.vmware.vcenter.vm.hardware.EthernetTypes.CreateSpec>();
		com.vmware.vcenter.vm.hardware.EthernetTypes.CreateSpec nic = new com.vmware.vcenter.vm.hardware.EthernetTypes.CreateSpec();
		nic.setStartConnected(true);
		for (String desc : nicsStr.trim().split(",")) {
			if (desc.trim().equals("type=l2bridge")) {
				nic.setBacking(new EthernetTypes.BackingSpec.Builder(BackingType.STANDARD_PORTGROUP)
						.setNetwork(standardNetworkBacking).build());
			} else if (desc.trim().equals("type=l3bridge")) {
				nic.setBacking(new EthernetTypes.BackingSpec.Builder(BackingType.DISTRIBUTED_PORTGROUP)
						.setNetwork(standardNetworkBacking).build());
			} else if (desc.startsWith("mac=")) {
				nic.setMacType(EthernetTypes.MacAddressType.MANUAL);
				nic.setMacAddress(desc.split("=")[1].trim());
			}
		}

		if (nic.getMacAddress() == null) {
			nic.setMacType(EthernetTypes.MacAddressType.GENERATED);
		}

		list.add(nic);
		return list;
	}

	public static List<DeviceTypes.EntryCreateSpec> toBoots(String value) {
		if (value.equals("cdrom")) {
			return Arrays.asList(new DeviceTypes.EntryCreateSpec.Builder(DeviceTypes.Type.CDROM).build(),
					new DeviceTypes.EntryCreateSpec.Builder(DeviceTypes.Type.DISK).build());
		} else {
			return Arrays.asList(new DeviceTypes.EntryCreateSpec.Builder(DeviceTypes.Type.DISK).build(),
					new DeviceTypes.EntryCreateSpec.Builder(DeviceTypes.Type.CDROM).build());
		}
	}

	public static List<CdromTypes.CreateSpec> toCDRom(String iso) {
		return Collections.singletonList(new CdromTypes.CreateSpec.Builder()
				.setBacking(new CdromTypes.BackingSpec.Builder(CdromTypes.BackingType.ISO_FILE).setIsoFile(iso).build())
				.build());
	}

	public static CpuTypes.UpdateSpec toCPUs(String vcpu) {
		return new CpuTypes.UpdateSpec.Builder().setCoresPerSocket(Long.parseLong(vcpu)).setHotAddEnabled(false)
				.setHotRemoveEnabled(false).build();
	}

	public static VMTypes.PlacementSpec toPlacement(ExtendedvSphereClient client, String hostName, String clusterName,
			String datacenterName, String vmFolderName, String datastoreName) {
		return PlacementHelper.getVMPlacementSpec(client.getVapiAuthHelper().getStubFactory(),
				client.getSessionStubConfig(), hostName, clusterName, datacenterName, vmFolderName, datastoreName);
	}

	public static MemoryTypes.UpdateSpec toRAMs(String ram) {
		return new MemoryTypes.UpdateSpec.Builder().setSizeMiB(Long.parseLong(ram) * 1024l).setHotAddEnabled(false)
				.build();
	}

	protected static String getSwitch(String desc) {
		for (String pair : desc.split(",")) {
			if (pair.startsWith("source=")) {
				return pair.split("=")[1].trim();
			}
		}
		return null;
	}

	public static void main(String[] args) {
		toDisks("/var/lib/libvirt/cstor/1709accf174fccaced76b0dbfccdev/1709accf174fccaced76b0dbfccdev/vmdisk1/vmdisk1,read_bytes_sec=1024000000,write_bytes_sec=1024000000 --disk /var/lib/libvirt/cstor/1709accf174fccaced76b0dbfccdev/1709accf174fccaced76b0dbfccdev/vmdisk2/vmdisk2,read_bytes_sec=1024000000,write_bytes_sec=1024000000 ");
	}
}
