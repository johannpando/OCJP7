package com.johannpando._11_.test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class TestCallablePoolInvokeAll {

	public static void main(String[] args) throws Exception {
		final ExecutorService pool = Executors.newFixedThreadPool(5);
		List<Callable<Integer>> cal = new ArrayList<>();

		cal.add(new Task2());
		cal.add(new Task1());

		// In this code, we have created three Callable objects (Task1, Task2,
		// Task3). Then we have created a FixedThreadPool with five threads.
		// This type of pool always has a specified number of threads running;
		// if a thread is somehow terminated while it is still in use, it is
		// automatically replaced with a new thread. Tasks are submitted to the
		// pool via an internal queue. Then we have added Task2 and Task1 to a
		// ArrayList. Using the �invokeAll()� method, we can execute the given
		// tasks in the a list and they execute in the same order which they are
		// added to the list. So here, first the Task2 will execute and then the
		// Rask 2 will execute. So the answer will be D.
		List<Future<Integer>> futures = pool.invokeAll(cal);

		for (Future<Integer> future : futures) {
			System.out.println("Task " + future.get());
		}

		pool.shutdown();
	}

	static class Task1 implements Callable<Integer> {

		@Override
		public Integer call() throws Exception {
			// TODO Auto-generated method stub
			return 1;
		}

	}

	static class Task2 implements Callable<Integer> {

		@Override
		public Integer call() throws Exception {
			// TODO Auto-generated method stub
			return 2;
		}

	}

	static class Task3 implements Callable<Double> {

		@Override
		public Double call() throws Exception {
			// TODO Auto-generated method stub
			return 3.0;
		}

	}

}
