package com.johannpando.chapter10._10_1.createAndUseThreads;

import java.util.Set;

public class ImprimirTodosLosThread {

	public static void main(String[] args) {
		Set<Thread> threadSet = Thread.getAllStackTraces().keySet();
		for (Thread thread : threadSet) {
			System.out.println(thread + " ----- " + thread.getState());
		}
	}

}
