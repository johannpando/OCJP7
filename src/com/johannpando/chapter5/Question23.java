package com.johannpando.chapter5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Question23 {

	/**
	 * We have used the [a-z0-9] with command line invocation, it will search
	 * for all characters in the alphabet an the digits between zero to nine. So
	 * it will print all the indexes and gives us the result as 0 1 2 3 4 5.
	 * 
	 * We have used the "." with the command line invocation II, it will sear
	 * for any character including numeric ones. So it will print all the
	 * indexes and gives us the result as 0 1 2 3 4 5.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Pattern pat = Pattern.compile(args[0]);
		//Matcher mat = pat.matcher("a1b2c3");
		Matcher mat = pat.matcher("baz");
		while (mat.find()) {
			System.out.print(mat.start() + " ");
		}
	}

}
