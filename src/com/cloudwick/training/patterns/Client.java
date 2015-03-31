package com.cloudwick.training.patterns;

public class Client {

	public static void main(String[] args) {

		//this client called only userfacory no need to worry about callies.
		UserFactory.getObject(1).getDetails();

		UserFactory.getObject(2).getDetails();

	}

}
