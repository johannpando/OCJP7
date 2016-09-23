package com.johannpando.training.concurrency.locks;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ILock {

	public static void main(String[] args) {
		Lock l = new ReentrantLock();
		l.lock();
		l.lock();
		l.unlock();
		try {
			l.lockInterruptibly();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		l.tryLock();
		try {
			l.tryLock(1500, TimeUnit.MILLISECONDS);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
