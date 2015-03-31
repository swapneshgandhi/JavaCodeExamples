package com.cloudwick.training.logging;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Calculator {
	final static Logger logger = Logger.getLogger(Calculator.class);
	public static int calulate(int num1, int num2) {
		
		logger.debug("calcualte method called with "+num1+" "+num2);
		logger.info("result is "+(num1+num2));
		
		if (num1<0){
			logger.error("please provide positive numbers");
		}
		
		return num1 + num2;
		
	}

	
	
	public static void main(String[] args) {

		PropertyConfigurator.configure("log4j_cloudwick.properties");
		calulate(1, 2);
		calulate(-1, 2);
		calulate(20, 20);
		calulate(0, 0);
	}

}
