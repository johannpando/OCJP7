package com.johannpando.chapter5;

public class Question25 {

	public static void main(String[] args) {

		// In this case we split on the expression "a{3}" and the tokens are
		// stored in the array s. Here the regular expression a{3} is searching
		// for three occurrences of the letter "a" in a row.

		String str = "aaaaaaaabb";
		String[] s = str.split("a{3}");
		System.out.println(s.length);
	}

}
