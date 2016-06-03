package com.johannpando.chapter11.test;

import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveAction;
import java.util.concurrent.RecursiveTask;

public class TestForkJoinTaskClass {

	public static void main(String[] args) {

		// Both classes (RecursiveAction and RecursiveTask) are inherited from
		// the ForkJoinTask class, all are abstract classes.
		ForkJoinTask<?> fjt;
		// Instance of RecursiveAction represents executions that don't yield a
		// return value;
		RecursiveAction ra = null;
		// Instance of RecursiveTask represents executions that yield a return
		// value.
		RecursiveTask<?> rt = null;

		fjt = ra;
		fjt = rt;
	}

}
