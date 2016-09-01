package com.johannpando.chapter10._10_4_4_deadlock;

public class IphoneApp extends Thread {

	Developer dev;
	Tester tester;

	public IphoneApp(Developer dev, Tester tester) {
		this.dev = dev;
		this.tester = tester;
	}

	@Override
	public void run() {
		synchronized (dev) {
			dev.code();
			tester.testAppln();
		}
	}
}
