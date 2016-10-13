package com.johannpando.training.Thread;

public class WhileTrue extends Thread {

	int i = 0;

	public static void main(String[] args) {
		WhileTrue wt = new WhileTrue();
		wt.start();
	}

	@Override
	public void run() {
		while (true) {
			if (i % 2 == 0) {
				System.out.println("Hello World::");
			}
		}
	}
}
