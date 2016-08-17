package com.johannpando._11_.test;

import java.util.concurrent.locks.ReentrantLock;

/**
 * ReentrantLock since Java 1.5
 * 
 * The ReentrantLock class.
 * <p>
 * Creates an instance with the given fairness policy. With this policy,
 * whenever a thread releases the lock the longest waiting thread will get the
 * lock next.
 * </p>
 * 
 * <p>
 * La clase ReentrantLock. Crea una instancia con la pol�tica de equidad dado.
 * Con esta pol�tica, cada vez que un hilo libera el bloqueo del hilo de espera
 * m�s larga conseguir� el bloqueo siguiente.
 * </p>
 * 
 * <p>
 * The Reentrant class can be considered as a replacement for the traditional
 * 'wait-notify' method.
 * </p>
 * 
 * @author Johann
 *
 */
public class TestReentrantLockClass {

	public static void main(String[] args) {
		ReentrantLock rl = new ReentrantLock();
		System.out.println(rl);
		boolean fair = false;
		ReentrantLock rl2 = new ReentrantLock(fair);
		System.out.println(rl2);
		fair = true;
		ReentrantLock rl3 = new ReentrantLock(fair);
		System.out.println(rl3);
	}

}
