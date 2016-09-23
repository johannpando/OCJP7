package com.johannpando.enthuware.threads;

public class Interrupt implements Runnable {

	public static void main(String[] args) {
		Interrupt i = new Interrupt();
		Thread t = new Thread(i);
		t.start();
	}

	@Override
	public void run() {
		for (int i = 0; i < 6; i++) {
			System.out.println(Thread.currentThread().getName());
			if (i == 4) {
				Thread.currentThread().interrupt();
			}
			if (Thread.currentThread().isInterrupted()) {
				System.out.println("Interrupted");
			}

		}
	}

}
