package com.johannpando._4_;

import java.util.Map;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;

/**
 * A ConcurrentSkipListMap is sorted according to its key. Since the keys here
 * are of String type, the key-value pairs are sorted in this order:
 * {0=20, 1=10, 2=5, 30=30, 4=300}
 * 
 * @author jpandode
 *
 */
public class Question14 {

	public static void main(String[] args) {

		ConcurrentNavigableMap myMap = new ConcurrentSkipListMap<>();
		myMap.put("1", 10);
		myMap.put("2", 5);
		myMap.put("30", 30);
		myMap.put("4", 300);
		myMap.put("0", 20);
		
		
		// Excpetion
		// Exception in thread "main" java.lang.ClassCastException: java.lang.String cannot be cast to java.lang.Integer
		// at java.lang.Integer.compareTo(Integer.java:52)
		// myMap.put(new Integer(2), 2);

		Map.Entry entry = myMap.lastEntry();

		System.out.println(entry.getKey());
	}

}
