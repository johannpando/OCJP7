package com.johannpando.chapter11.test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class TestCallableAwaiTerminationMethod {

	public static void main(String[] args) throws Exception {

		// In this code, we have created two Callable objects (Task1, Task2).
		// Then we have created a FixedThreadPool with two threads. This type of
		// pool always has a specified number of threads running; if a thread is
		// somehow terminated while it is still in use, it is automatically
		// replaced with a new thread. Tasks are submitted to the pool via an
		// internal queue. Then we have submitted the task1 and task2 for
		// execution.
		final ExecutorService pool = Executors.newFixedThreadPool(2);

		Future f1 = pool.submit(new Task1());
		Future f2 = pool.submit(new Task2());

		// The ExecutorService’s “awaitTermination()” method Block until all
		// tasks have completed execution after a shutdown request, or the
		// timeout occurs, or the current thread is interrupted, whichever
		// happens first.
		pool.awaitTermination(4, TimeUnit.SECONDS);

		pool.shutdownNow();
	}

	static class Task1 implements Runnable {

		@Override
		public void run() {
			System.out.println("Task 1");
		}

	}

	static class Task2 implements Runnable {

		@Override
		public void run() {
			System.out.println("Task 2");
			try {
				// As the Task1 has submitted first, it will execute first and
				// print Task 1. But when Task2 executes it will go to sleep
				// mode for 4.5 seconds after printing the “Task 2 “. But at
				// line 28, we have invoke the “awaitTermination()” method by
				// passing 4 seconds. So it will cause the shutdown of the
				// thread pool after 4 seconds from the first task execution.
				// Therefore sleep will interrupt as it will be in the sleep
				// mode when the pool shutdown, so an InterruptedException will
				// be thrown at the runtime.
				Thread.sleep(4500);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}

	}

}
