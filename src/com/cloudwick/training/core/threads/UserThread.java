package com.cloudwick.training.core.threads;

public class UserThread extends Thread {

	int num;

	public UserThread(int num) {
		this.num = num;
	}

	public void run() {

		int sum = 0;
		for (int i = 1; i <= num; ++i) {
			sum += i;
			
		}
		System.out.println("value for " + num + " is: " + sum + ","
				+ Thread.currentThread());
	}

}
