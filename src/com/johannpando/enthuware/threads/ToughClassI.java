package com.johannpando.enthuware.threads;

public class ToughClassI {

	public static void main(String[] args) {
		Thread.currentThread().setName("First");
		MyRunnable mr = new MyRunnable("MyRunnable");
		mr.run();
		Thread.currentThread().setName("Second");
		mr.run();
	}

}

class MyRunnable implements Runnable {

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}

	public MyRunnable(String name) {
		new Thread(this, name).start();
	}

}
