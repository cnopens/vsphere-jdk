package com.github.kubesys.models;

import javax.validation.constraints.Pattern;

import com.github.kubesys.annotations.ParameterDescriber;
import com.github.kubesys.utils.RegExpUtils;

public class CreateAndStartVMFromImage {

	@ParameterDescriber(required = true, description = "目标存储池名", constraint = "由4-100位的数字和小写字母组成，已创建出的存储池", example = "pool2")
	@Pattern(regexp = RegExpUtils.NAME_PATTERN)
	protected String targetPool;

	@ParameterDescriber(required = true, description = "云盘镜像的路径", constraint = "路径必须在/var/lib/libvirt下，18-1024位，只允许小写、字母、中划线和圆点", example = "/var/lib/libvirt/test.qcow2")
	@Pattern(regexp = RegExpUtils.PATH_PATTERN)
	protected String source;

	@ParameterDescriber(required = false, description = "默认为从快照创建，true为全拷贝", constraint = "默认为从快照创建，true为全拷贝", example = "true")
	protected boolean full_copy;
	
	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getTargetPool() {
		return targetPool;
	}

	public void setTargetPool(String targetPool) {
		this.targetPool = targetPool;
	}

	public boolean getFull_copy() {
		return full_copy;
	}

	public void setFull_copy(boolean full_copy) {
		this.full_copy = full_copy;
	}

}
