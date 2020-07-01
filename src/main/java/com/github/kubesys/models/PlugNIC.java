package com.github.kubesys.models;

import javax.validation.constraints.Pattern;

import com.github.kubesys.annotations.ParameterDescriber;
import com.github.kubesys.utils.RegExpUtils;

public class PlugNIC {

	@ParameterDescriber(required = true, description = "虚拟机网络", constraint = "type=l2bridge/l3bridge,source=交换机名（必填）mac=mac地址（选填），"
			+ "参数顺序必须是type,source,mac", example = "type=l2bridge,source=br-int,mac=00:00:00:00:00:00")
	@Pattern(regexp = RegExpUtils.NETWORK_TYPE_PATTERN)
	protected String network;
	
	protected String type;
	
	protected String source;
	
	protected String mac;

	public String getType() {
		return "type=" + type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getSource() {
		return "source=" + source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getMac() {
		return "mac=" + mac;
	}

	public void setMac(String mac) {
		this.mac = mac;
	}

	@Override
	public String toString() {
		return getType() + "," + getSource() + "," + getMac();
	}
	
}
