/*
 * Copyright (2019, ) Institute of Software, Chinese Academy of Sciences
 */
package com.github.kubesys;


import org.apache.log4j.Logger;

import com.github.kubesys.impls.VirtualMachineImpl;
import com.vmware.vapi.bindings.StubConfiguration;
import com.vmware.vapi.protocol.HttpConfiguration;
import com.vmware.vapi.protocol.HttpConfiguration.SslConfiguration;

import vmware.samples.common.SslUtil;
import vmware.samples.common.authentication.VapiAuthenticationHelper;
import vmware.samples.common.authentication.VimAuthenticationHelper;

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
public class ExtendedvSphereClient {

	/**
	 * m_logger
	 */
	public final static Logger m_logger = Logger.getLogger(ExtendedvSphereClient.class.getName());

	protected VimAuthenticationHelper vimAuthHelper;

	protected VapiAuthenticationHelper vapiAuthHelper;

	protected StubConfiguration sessionStubConfig;

	public ExtendedvSphereClient(String server, String username, String password) throws Exception {
		super();
		this.vapiAuthHelper = new VapiAuthenticationHelper();
		this.vimAuthHelper = new VimAuthenticationHelper();
		HttpConfiguration httpConfig = buildHttpConfiguration();
		this.sessionStubConfig = vapiAuthHelper.loginByUsernameAndPassword(server, username, password, httpConfig);
		this.vimAuthHelper.loginByUsernameAndPassword(server, username, password);
	}

	protected HttpConfiguration buildHttpConfiguration() throws Exception {
		HttpConfiguration httpConfig = new HttpConfiguration.Builder().setSslConfiguration(buildSslConfiguration())
				.getConfig();

		return httpConfig;
	}

	protected SslConfiguration buildSslConfiguration() throws Exception {
		SslUtil.trustAllHttpsCertificates();
		return new SslConfiguration.Builder().disableCertificateValidation().disableHostnameVerification().getConfig();
	}
	
	public VimAuthenticationHelper getVimAuthHelper() {
		return vimAuthHelper;
	}

	public void setVimAuthHelper(VimAuthenticationHelper vimAuthHelper) {
		this.vimAuthHelper = vimAuthHelper;
	}

	public VapiAuthenticationHelper getVapiAuthHelper() {
		return vapiAuthHelper;
	}

	public void setVapiAuthHelper(VapiAuthenticationHelper vapiAuthHelper) {
		this.vapiAuthHelper = vapiAuthHelper;
	}

	public StubConfiguration getSessionStubConfig() {
		return sessionStubConfig;
	}

	public void setSessionStubConfig(StubConfiguration sessionStubConfig) {
		this.sessionStubConfig = sessionStubConfig;
	}

	public VirtualMachineImpl virtualmachines() {
		return new VirtualMachineImpl(this);
	}

	public static void main(String[] args) throws Exception {
		ExtendedvSphereClient client = new ExtendedvSphereClient("133.133.135.35", "administrator@vsphere.test", "Onceas!234");
		client.virtualmachines().list();
	}
}
