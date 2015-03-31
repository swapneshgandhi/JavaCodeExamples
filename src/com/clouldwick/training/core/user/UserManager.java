package com.clouldwick.training.core.user;

public class UserManager extends UserAbstract implements UserI {

	public String firstName;
	private int ssn;
	protected int age;
	public static final String state="CA";

	public void setName(String name) {
		this.firstName = name;
	}

	public int calculate(int num1, int num2) {
		return num1 + num2;
	}

	public int calculate(int num1, int num2, int type) {
		return num1 - num2;
	}
	
	@Override
	public int getSsn() {
		return 22342423;
	}

	@Override
	public int getState() {
		return 30;
	}

	public void printResult() {
		super.printResult();
		System.out.println("My last name is Gandhi");
	}
	
}
