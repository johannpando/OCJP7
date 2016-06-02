package com.johannpando.chapter11.test;

import java.util.concurrent.atomic.AtomicInteger;

import com.johannpando.chapter11.test.Th2.CStore;

public class TestAtomicInteger {

	public static void main(String[] args) {
		CStore cs = new CStore();
		Thread th1 = new Thread(cs);
		Thread th2 = new Thread(cs);
		Thread th3 = new Thread(cs);
		
		th1.start();
		th2.start();
		th3.start();
	}

}


class Th2 {
	public static class CStore implements Runnable {

		int x;
		private AtomicInteger cps = new AtomicInteger(0);
		
		@Override
		public void run() {
			while (x < 2) {
				x = cps.getAndIncrement();
				try {
					Thread.sleep(500);
				} catch (Exception e){
					System.out.println(e);
				}
				System.out.println(x);
			}
		}
		
	}
}