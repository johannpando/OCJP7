package com.johannpando.chapter10._10_4_4_deadlock;

public class AndroidApp extends Thread {

	Developer dev;
	Tester tester;

	public AndroidApp(Developer dev, Tester tester) {
		this.dev = dev;
		this.tester = tester;
	}

	@Override
	public void run() {
		// Se adquiere el lock sobre tester.
		synchronized (tester) {
			tester.testAppln();
			dev.fixBugs();
		}
	}
}
