package com.johannpando.chapter10._10_4_3_WaitingForNotificacionOfEvents;

public class GoRafting extends Thread {

	Friend friend;

	public GoRafting(Friend friend) {
		this.friend = friend;
	}

	@Override
	public void run() {
		System.out.println("Friend reached: " + friend.reached);
		synchronized (friend) {
			try {
				friend.wait();
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}
		System.out.println("Reached: " + friend.reached + ", going rafting");
	}
}
