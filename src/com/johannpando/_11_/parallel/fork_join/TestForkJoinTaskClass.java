package com.johannpando._11_.parallel.fork_join;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveAction;
import java.util.concurrent.RecursiveTask;

public class TestForkJoinTaskClass {

	public static void main(String[] args) {
		ForkJoinTask<String> forkJoinTask = null;

		RecursiveTask<String> recursiveTask;
		RecursiveAction recursiveAction;

		ForkJoinPool fjp = new ForkJoinPool(1);
		fjp.invoke(forkJoinTask);
	}

}
