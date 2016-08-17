package com.johannpando._11_.parallel.fork_join;

import java.util.Random;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class UsingForkJoinPool {

	public static void main(String[] args) {
		int[] intArray = new int[100];
		Random randomValues = new Random();

		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = randomValues.nextInt(10);
		}

		// Instantiates a ForkJoinPool.
		ForkJoinPool pool = new ForkJoinPool();
		CalcSum calculator = new CalcSum(intArray);

		// Invoke() awaits and obtain result.
		System.out.println(pool.invoke(calculator));
	}

}

class CalcSum extends RecursiveTask<Integer> {

	private int UNIT_SIZE = 15;
	private int[] values;
	private int startPos;
	private int endPos;

	public CalcSum(int[] values) {
		this(values, 0, values.length);
	}

	public CalcSum(int[] values, int startPos, int endPos) {
		this.values = values;
		this.startPos = startPos;
		this.endPos = endPos;
	}

	@Override
	protected Integer compute() {
		final int currentSize = endPos - startPos;
		if (currentSize <= UNIT_SIZE) {
			return computeSum();
		} else {
			int center = currentSize / 2;
			int leftEnd = startPos + center;
			CalcSum leftSum = new CalcSum(values, startPos, leftEnd);
			// Calling fork on leftSum makes it execute asynchronously
			leftSum.fork();

			int rightStart = startPos + center + 1;
			CalcSum rightSum = new CalcSum(values, rightStart, endPos);
			// leftSum.join waits until it return a value; compute is main
			// computation performed by task
			return (rightSum.compute() + leftSum.join());
		}
	}

	// Private helper method
	private Integer computeSum() {
		int sum = 0;
		for (int i = startPos; i < endPos; i++) {
			sum += values[i];
		}
		System.out.println("Sum (" + startPos + "-" + endPos + "):" + sum);
		return sum;
	}

}
