package com.johannpando.test1.Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.NavigableSet;
import java.util.TreeSet;

public class Q29NavigableSetMethodPollFirst {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		list.add(7);
		list.add(6);
		list.add(6);
		list.add(5);
		NavigableSet<Integer> navigableSet = new TreeSet<>(list);
		// The pollFirst method in NavigableSet interface retrieves an removes
		// the first (lowest?) element, or returns null if this set is empty.
		System.out.println(navigableSet.pollFirst());
		System.out.println(navigableSet.size());
	}

}
