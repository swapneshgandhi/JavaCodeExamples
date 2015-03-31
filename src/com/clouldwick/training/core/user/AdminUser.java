package com.clouldwick.training.core.user;

public class AdminUser extends UserManager {

	public void printData(){
		System.out.println("Comming from AdminUser");
	}
	
	public int calculate(int num1, int num2, int type) {
		return num1 * num2;
	}

	public String toString(){
		return "This is toString from AdminManager";
	}
	
}
