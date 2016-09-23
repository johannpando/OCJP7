package com.johannpando.training.concurrency.atomic;

import java.util.concurrent.atomic.AtomicInteger;

public class CAtomicInteger {

	public static void main(String[] args) {
		AtomicInteger ai = new AtomicInteger();
		System.out.println(ai.addAndGet(1));// 1
		System.out.println(ai.getAndAdd(2));// 1
		System.out.println(ai.getAndSet(3));// 3
		System.out.println(ai.getAndDecrement());// 3
		System.out.println(ai.getAndIncrement());// 2
		System.out.println(ai.decrementAndGet());// 2
		System.out.println(ai.incrementAndGet());// 3

		System.out.println(ai.compareAndSet(2, 3));// false
		System.out.println(ai.compareAndSet(3, 4));// true
		System.out.println(ai); // 4
	}
}
