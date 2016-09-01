package com.johannpando.chapter10._10_4_3_WaitingForNotificacionOfEvents;

public class Camping {

	public static void main(String[] args) {
		Friend paul = new Friend();
		GoRafting rafting = new GoRafting(paul);
		rafting.start();
		paul.start();
	}

}
