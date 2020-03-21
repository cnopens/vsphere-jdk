package com.github.kubesys.models;

import javax.validation.constraints.Pattern;

import com.github.kubesys.annotations.ParameterDescriber;
import com.github.kubesys.utils.RegExpUtils;
import com.vmware.vcenter.vm.GuestOS;

public class CreateAndStartVMFromISO {

	@ParameterDescriber(required = false, description = "用户生成虚拟机的元数据", constraint = "uuid=<UUID>，UUID是字符串类型，长度是12到36位，只允许数字、小写字母、中划线、以及圆点", example = "uuid=950646e8-c17a-49d0-b83c-1c797811e001")
	@Pattern(regexp = RegExpUtils.UUID_PATTERN)
	protected String metadata;

	@ParameterDescriber(required = true, description = "虚拟机磁盘，包括硬盘和光驱", constraint = "数据盘约束：硬盘名,size=单位GB，支持多个硬盘，第一个硬盘无需添加--disk，后续的需要", example = "datadisk1,size=10 --disk datadisk2,size=1024000000")
//	@Pattern(regexp = RegExpUtils.MUTI_DISKS_PATTERN)
	protected String disk;

	@ParameterDescriber(required = true, description = "虚拟机内存大小，单位为MiB", constraint = "取值范围：100~99999", example = "2048")
	@Pattern(regexp = RegExpUtils.RAM_MiB_PATTERN)
	protected String memory;

	@ParameterDescriber(required = true, description = "虚拟机网络", constraint = "type=l2bridge/l3bridge,source=交换机名（必填）mac=mac地址（选填），"
			+ "参数顺序必须是type,source,mac", example = "type=l2bridge,source=br-int,mac=00:00:00:00:00:00")
	@Pattern(regexp = RegExpUtils.NETWORK_TYPE_PATTERN)
	protected String network;

	@ParameterDescriber(required = false, description = "虚拟化类型", constraint = "取值范围：vmware", example = "vmware")
	@Pattern(regexp = RegExpUtils.VIRT_TYPE_PATTERN)
	protected String virt_type;

	@ParameterDescriber(required = false, description = "设置启动顺序", constraint = "hd|cdrom，分别表示硬盘和光驱启动", example = "hd")
	@Pattern(regexp = RegExpUtils.BOOT_PATTERN)
	protected String boot = "cdrom";

	@ParameterDescriber(required = true, description = "操作系统类型，如果不设置可能发生鼠标偏移等问题", constraint = "参见com.vmware.vcenter.vm.GuestOS", example = "centos7.0")
	protected GuestOS os_variant;

	@ParameterDescriber(required = true, description = "虚拟机CPU个数，及其物理CPU绑定关系", constraint = "0~100", example = "2,cpuset=1-4")
	@Pattern(regexp = RegExpUtils.VCPUSET_PATTERN)
	protected String vcpus;

	@ParameterDescriber(required = false, description = "虚拟机挂载的光驱，重启失效", constraint = "路径类型，18-1024位，只允许小写、字母、中划线和圆点", example = "/var/lib/libvirt/ISO/CentOS-7-x86_64-Minimal-1511.iso")
	@Pattern(regexp = RegExpUtils.PATH_PATTERN)
	protected String cdrom;

	public String getMetadata() {
		return metadata;
	}

	public void setMetadata(String metadata) {
		this.metadata = metadata;
	}

	public String getDisk() {
		return disk;
	}

	public void setDisk(String disk) {
		this.disk = disk;
	}

	public String getMemory() {
		return memory;
	}

	public void setMemory(String memory) {
		this.memory = memory;
	}

	public String getNetwork() {
		return network;
	}

	public void setNetwork(String network) {
		this.network = network;
	}

	public String getVirt_type() {
		return virt_type;
	}

	public void setVirt_type(String virt_type) {
		this.virt_type = virt_type;
	}

	public String getBoot() {
		return boot;
	}

	public void setBoot(String boot) {
		this.boot = boot;
	}

	public GuestOS getOs_variant() {
		return os_variant;
	}

	public void setOs_variant(GuestOS os_variant) {
		this.os_variant = os_variant;
	}

	public String getVcpus() {
		return vcpus;
	}

	public void setVcpus(String vcpus) {
		this.vcpus = vcpus;
	}

	public String getCdrom() {
		return cdrom;
	}

	public void setCdrom(String cdrom) {
		this.cdrom = cdrom;
	}

}
