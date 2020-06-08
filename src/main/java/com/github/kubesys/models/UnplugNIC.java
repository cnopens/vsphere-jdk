package com.github.kubesys.models;

import javax.validation.constraints.Pattern;

import com.github.kubesys.annotations.ParameterDescriber;
import com.github.kubesys.utils.RegExpUtils;

public class UnplugNIC {

	@ParameterDescriber(required = false, description = "虚拟机名", constraint = "取值范围：none, writethrough, directsync, unsafe, writeback", example = "none")
	@Pattern(regexp = RegExpUtils.NAME_PATTERN)
	protected String vmid;

	@Pattern(regexp = RegExpUtils.NAME_PATTERN)
	@ParameterDescriber(required = false, description = "磁盘id", constraint = "0~99999", example = "40000")
	protected String diskid;

	public String getVmid() {
		return vmid;
	}

	public void setVmid(String vmid) {
		this.vmid = vmid;
	}

	public String getDiskid() {
		return diskid;
	}

	public void setDiskid(String diskid) {
		this.diskid = diskid;
	}

}
