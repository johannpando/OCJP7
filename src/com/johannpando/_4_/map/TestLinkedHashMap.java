package com.johannpando._4_.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class TestLinkedHashMap {

	public static void main(String[] args) {

		// La clase LinkedHashMap mantiene el orden de inserción de sus
		// elementos
		Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
		linkedHashMap.put("uno", 1);
		linkedHashMap.put("dos", 2);
		linkedHashMap.put("tres", 3);
		linkedHashMap.put("cuatro", 4);
		linkedHashMap.put("cinco", 5);

		for (Integer valor : linkedHashMap.values()) {
			System.out.println(valor);
		}
	}

}
