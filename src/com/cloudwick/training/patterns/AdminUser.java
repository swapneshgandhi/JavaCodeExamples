package com.cloudwick.training.patterns;

public class AdminUser implements UserI {

	@Override
	public void getDetails() {
		System.out.println("AdminUSer class called");
	}

}
