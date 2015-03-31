package com.cloudwick.training.core.threads;

import java.util.ArrayList;
import java.util.List;

public class ThreadManager {

	public static void main(String[] args) throws InterruptedException {

		List<Thread> tList = new ArrayList<>();

		for (int i = 0; i < 500; i++) {
			UserThread t = new UserThread(i);
			t.setName("cloudwick" + i);
			tList.add(t);
			if (i > 100 && i < 200) {
				t.setPriority(Thread.MAX_PRIORITY);
			}
			t.start();
		}
		int running = 0;

		do {
			//running = 0;
			for (Thread a : tList) {
				if (a.isAlive()) {
					running++;
				}
			}

		} while (running != 0);
		Thread.sleep(5000);
		System.out.println("***********DONE************");
	}
}
