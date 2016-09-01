package com.johannpando.chapter10._10_4_4_deadlock;

public class DeadLock {

	public static void main(String[] args) {
		Tester paul = new Tester();
		Developer selvan = new Developer();

		AndroidApp androidApp = new AndroidApp(selvan, paul);
		IphoneApp iphoneApp = new IphoneApp(selvan, paul);

		androidApp.start();
		iphoneApp.start();
	}

}
