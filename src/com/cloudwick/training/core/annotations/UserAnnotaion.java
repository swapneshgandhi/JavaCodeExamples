package com.cloudwick.training.core.annotations;

public class UserAnnotaion {

	public void printResult(){
		System.out.println("invokeed printResult method");
	}

	@LogMessage
	public int calculate(int num1, int num2){
		return num1+num2;
	}
	
	@LogMessage
	public void printData(){
		System.out.println("invokeed printData method");
	}
	
}

