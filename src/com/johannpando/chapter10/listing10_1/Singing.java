package com.johannpando.chapter10.listing10_1;

public class Singing extends Thread {

	public void run() {
		System.out.println("Singing...");
	}

	public static void main(String[] args) {
		Thread sing = new Singing();
		sing.start();
		System.out.println("Dancing...");
	}
}
