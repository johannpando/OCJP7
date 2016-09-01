package com.johannpando.chapter10._10_4_3_WaitingForNotificacionOfEvents;

public class Friend extends Thread {

	boolean reached = false;

	@Override
	public void run() {
		while (!reached) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
			confirmedReached();
		}
	}

	private synchronized void confirmedReached() {
		reached = true;
		notify();
	}
}
