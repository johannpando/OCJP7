package com.johannpando.chapter10.twistInTheTale10_1;

public class SingingAndDance {

	public static void main(String[] args) {
		Thread sing = new Sing();
		Thread newThread = new Thread(sing);
		newThread.start();
	}

}

class Sing extends Thread {
	public void run() {
		System.out.println("Singing...");
	}
}
