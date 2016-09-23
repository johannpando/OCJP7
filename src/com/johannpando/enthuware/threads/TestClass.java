package com.johannpando.enthuware.threads;

public class TestClass implements Runnable {

	volatile int x;

	public static void main(String[] args) {
		TestClass tc = new TestClass();
		tc.x = 10;
		new Thread(tc).start();
		System.out.println(tc.x);
	}

	@Override
	public void run() {
		x = 5;
	}

}
