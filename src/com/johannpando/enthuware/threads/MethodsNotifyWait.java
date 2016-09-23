package com.johannpando.enthuware.threads;

public class MethodsNotifyWait {

	public static void main(String[] args) {

		// Causa IllegalMonitorStateException si no ha adquirido un monitor
		Object o = new Object();
		o.notify();

	}

}
