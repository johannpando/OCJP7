package com.johannpando.chapter10._10_4_4_deadlock;

public class Developer {

	// 1.- Métodos sincronizados
	synchronized void fixBugs() {
		System.out.println("Fixing...");
	}

	synchronized void code() {
		System.out.println("Coding...");
	}
}
