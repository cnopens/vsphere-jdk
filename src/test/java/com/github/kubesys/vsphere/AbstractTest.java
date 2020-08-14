package com.github.kubesys.vsphere;

import com.github.kubesys.ExtendedvSphereClient;

public class AbstractTest {

	protected static ExtendedvSphereClient client;

	static {
		try {
			client = new ExtendedvSphereClient(
					"133.133.135.35", 
					"administrator@vsphere.test", 
					"Onceas2020!234");
		} catch (Exception e) {
		}
	}
}
