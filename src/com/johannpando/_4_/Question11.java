package com.johannpando._4_;

import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.TreeMap;

/**
 * The firstEntry() method return a key-value mapping associated with the least
 * key in this map, or null if the map is empty.
 * 
 * @author jpandode
 *
 */
public class Question11 {

	public static void main(String[] args) {

		NavigableMap<String, String> nMap = new TreeMap<>();

		nMap.put("1", "uno");
		nMap.put("3", "tres");
		nMap.put("2", "dos");

		Entry<String, String> firstEntry = nMap.firstEntry();

		System.out.println("Mostrando valores del navigableMap:");

		for (Entry<String, String> entry : nMap.entrySet()) {
			System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
		}

		System.out.println("Mostrando nMap.firstEntry");
		System.out.println("Key: " + firstEntry.getKey() + ", Value: " + firstEntry.getValue());
	}

}
