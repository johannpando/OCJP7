package com.johannpando.chapter10.listing10_2;

public class Sing implements Runnable {

	@Override
	public void run() {
		System.out.println("Singing...");
	}

	public static void main(String[] args) {
		Thread sing = new Thread(new Sing(), "HiloSing");
		sing.start();
		System.out.println("Dancing...");
		System.out.println(Thread.currentThread().getName());
		System.out.println(sing.getName());
	}
}
