package com.johannpando.training.concurrency.locks;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class IReadWriteLock {
	public static void main(String[] args) {
		ReadWriteLock rwl = new ReentrantReadWriteLock();
		rwl.readLock();
		rwl.writeLock();
	}
}
