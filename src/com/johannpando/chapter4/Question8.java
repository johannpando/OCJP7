package com.johannpando.chapter4;

import java.util.HashSet;
import java.util.Set;

public class Question8 {

	public static void main(String[] args) {

		Set<String> s = new HashSet<String>();
		s.add("apple");
		s.add("Apple");
		s.add("1");
		s.add("1.0");

		// The program does not compile because the toArray() method returns an
		// object of type needs to be cast to String[] for the program to
		// compile.

		// String[] ss = s.toArray();

		// Another option is to use the toArray() method which takes an argument
		// that is the type of array to which the return type is to be cast.
		
		String[] ss = s.toArray(new String[0]);
		
		String[] sss = (String[]) s.toArray();

	}

}
