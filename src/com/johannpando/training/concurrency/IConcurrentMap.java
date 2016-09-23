package com.johannpando.training.concurrency;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class IConcurrentMap {

	public static void main(String[] args) {
		ConcurrentMap<Integer, String> cm = new ConcurrentHashMap<>();
		String valor1 = cm.putIfAbsent(1, "uno");
		System.out.println(valor1);// null
		String valor2 = cm.putIfAbsent(1, "2");
		System.out.println(valor2);// uno
		cm.putIfAbsent(2, "dos");

		cm.putIfAbsent(null, null);
	}

}
