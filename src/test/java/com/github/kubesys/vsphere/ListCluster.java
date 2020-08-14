package com.github.kubesys.vsphere;


public class ListCluster extends AbstractTest {

	public static void main(String[] args) {
		System.out.println(client.virtualmachinepools().listClusters());
		System.out.println(client.virtualmachinepools().getCluster("domain-c16"));
		System.out.println(client.virtualmachinepools().getPool("resgroup-17"));
		
		System.out.println(client.virtualmachinepools().listFolders());
	}
	
}
