package com.cloudwick.training.patterns;

public class CloudwickAdminUser extends CloudwickGeneralUser {

	public void authenticate() {
		super.authenticate();
		System.out.println("allowed role 2 ");
	}

}
