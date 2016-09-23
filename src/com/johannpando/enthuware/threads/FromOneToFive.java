package com.johannpando.enthuware.threads;

public class FromOneToFive extends Thread {

	private static int threadcounter = 0;

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			new FromOneToFive().start();
		}
		System.out.println(threadcounter + "DONE");
	}

	@Override
	public void run() {
		threadcounter++;
		System.out.println(threadcounter);
	}

}
