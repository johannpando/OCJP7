package com.johannpando.test1.Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.NavigableSet;
import java.util.TreeSet;

public class TestNavigableSetMethodCeiling {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(4);
		list.add(8);
		list.add(9);

		System.out.println("longi list: " + list.size());

		NavigableSet<Integer> navigableSet = new TreeSet<Integer>(list);

		System.out.println("longi navigableSet: " + navigableSet.size());

		// Método ceiling devuelve el elemento mayor o igual (el más cercano)
		System.out.println(navigableSet.ceiling(6));
	}

}
