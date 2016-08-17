package com.johannpando._11_.test;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * <p>
 * </p>
 * 
 * Which of the following is true about above code?
 * 
 * <p>
 * C. In this code, instead of using the locks, we could use synchronization for
 * providing thread safety. </br>
 * Option C is correct as the using the lock objects we can provide the thread
 * safety like using synchronization.
 * </p>
 * 
 * <p>
 * D. If we used synchronization instead of locks then this code will perform
 * more efficiently in multi threading environment. </br>
 * Option D is incorrect as synchronization is less efficient when compare to
 * locks.
 * </p>
 * 
 * <p>
 * E. Locking and unlocking will not provide thread safety for set and get
 * operations. </br>
 * Option E is incorrect as here, locking and the unlocking operations provide
 * the tread safety by acquiring locks when it�s needed.
 * </p>
 * 
 * @author Johann
 *
 */
public class TestLockNotUseCorrectly {

	private final Lock lock = new ReentrantLock();
	private final int[] array;

	public TestLockNotUseCorrectly(int size) {
		array = new int[size];
	}

	public void set(int index, int value) {
		lock.lock();
		try {
			array[index] = value;
		} finally {
			lock.unlock();
		}
	}

	public int get(int index) {
		lock.lock();
		try {
			return array[index];
		} finally {
			lock.unlock();
		}
	}

}
