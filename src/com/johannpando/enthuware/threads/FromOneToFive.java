package com.johannpando.enthuware.threads;

import java.util.concurrent.atomic.AtomicInteger;

public class FromOneToFive extends Thread {

	// private static volatile int threadcounter = 0;

	private static AtomicInteger threadcounter = new AtomicInteger(0);

	public static void main(String[] args) {
		// for (int i = 0; i < 5; i++) {
		// new FromOneToFive().start();
		// }

		Thread t1 = new FromOneToFive();
		Thread t2 = new FromOneToFive();
		Thread t3 = new FromOneToFive();
		Thread t4 = new FromOneToFive();
		Thread t5 = new FromOneToFive();
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		System.out.println(threadcounter + "DONE");

	}

	@Override
	public void run() {
		// synchronized (this) {
		// threadcounter++;
		// threadcounter.incrementAndGet();
		System.out.println(threadcounter.incrementAndGet());
		// }
	}

}
