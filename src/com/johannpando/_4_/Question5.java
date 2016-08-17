package com.johannpando._4_;

import java.util.Map.Entry;
import java.util.SortedMap;
import java.util.TreeMap;

public class Question5 {

	public static void main(String[] args) {

		TreeMap<String, String> map = new TreeMap<String, String>();

		map.put("a", "apple");
		map.put("e", "egg");
		map.put("g", "gear");

		// From inclusive
		// To exclusive
		SortedMap<String, String> smap = map.subMap("a", "e");

		System.out.println("Contenido de 'smap' original");
		for (Entry<String, String> entrySet : smap.entrySet()) {
			System.out.println("Key: " + entrySet.getKey() + ", Value: " + entrySet.getValue());
		}

		smap.put("b", "ball");

		// Al a�adir un valor fuera del rango (el rango es "a" a "d")
		// Causa una excpeci�n:
		// Exception in thread "main" java.lang.IllegalArgumentException: key
		// out of range

		//smap.put("f", "fish");
		
		map.put("c", "cat");
		
		System.out.println("Despu�s de a�adir un valor a 'subMap'");
		for (Entry<String, String> entrySet : smap.entrySet()) {
			System.out.println("Key: " + entrySet.getKey() + ", Value: " + entrySet.getValue());
		}
		
		System.out.println("Despu�s de a�adir un valor al 'map'");
		for (Entry<String, String> entrySet : map.entrySet()) {
			System.out.println("Key: " + entrySet.getKey() + ", Value: " + entrySet.getValue());
		}
	}

}
