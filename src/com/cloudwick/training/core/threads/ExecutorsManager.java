package com.cloudwick.training.core.threads;

import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorsManager {

	public static void main(String[] args) {

		ExecutorService es = Executors.newFixedThreadPool(10);

		for (int i = 0; i < 500; i++) {
			UserThread t = new UserThread(1000000+i);
			es.execute(t);
		}
		es.shutdown();
		
		do {
			
		} while(!es.isTerminated());
			
		System.out.println("***************done*******************");
		
	}
	
}
