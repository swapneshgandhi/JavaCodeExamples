package com.cloudwick.training.patterns;

public class SuperUser implements UserI {

	@Override
	public void getDetails() {
		System.out.println("SuperUser class called");
	}

}
