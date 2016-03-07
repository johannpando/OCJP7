package com.johannpando.chapter4;

import java.util.TreeSet;

/**
 * When line 23 executes, 529 is added to the subset variable an
 * IllegalArgumentException will be thrown at runtime at line 23 because of an
 * attempt to insert out-of-range value into subset.
 * 
 * @author jpandode
 *
 */
public class Question25 {

	public static void main(String[] args) {

		TreeSet<Integer> set = new TreeSet<>();
		TreeSet<Integer> subSet = new TreeSet<>();

		for (int i = 506; i < 513; i++) {
			if (i % 2 == 0) {
				subSet = (TreeSet) set.subSet(508, true, 511, true);
			}
		}

		subSet.add(529);
		System.out.println(set + " " + subSet);
	}

}
