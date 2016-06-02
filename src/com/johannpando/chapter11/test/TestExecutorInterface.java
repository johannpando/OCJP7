package com.johannpando.chapter11.test;

import java.util.concurrent.Executor;
import java.util.concurrent.ForkJoinPool;

public class TestExecutorInterface {

	public static void main(String[] args) {

		Executor e = new ForkJoinPool();
		// Executes the given command at some time in the future. The command
		// may execute in a new thread, in a pooled thread, or in the calling
		// thread, at the discretion of the Executor implementation
		e.execute(new Example());
	}

}

class Example implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub

	}

}
