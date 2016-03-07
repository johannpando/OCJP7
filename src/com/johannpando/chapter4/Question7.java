package com.johannpando.chapter4;

import java.util.NavigableSet;
import java.util.concurrent.ConcurrentSkipListSet;

/**
 * The ConcurrentSkipListSet maintains the elements in alphabetical order. The
 * headset(toElement) method of NavigableSet returns a view of the portion of
 * the set whose elements are less than toElement.
 * 
 * WARNING! ConcurrentSkipListSet.headSet: The returned set is backed by this
 * set, so changes in the returned set are reflected in this set, and
 * vice-versa.
 * 
 * @author jpandode
 *
 */
public class Question7 {

	public static void main(String[] args) {

		ConcurrentSkipListSet<String> mySet = new ConcurrentSkipListSet<String>();
		mySet.add("me");
		mySet.add("you");
		mySet.add("your");
		mySet.add("they");
		mySet.add("she");

		System.out.println("mySet original");
		for (String string : mySet) {
			System.out.print(string + " ");
		}

		NavigableSet<String> mySet1 = mySet.headSet("your");
		System.out.println();
		System.out.println("Despues de haber realizado mySet.headSet('your')");
		for (String string : mySet1) {
			System.out.print(string + " ");
		}
	}

}
