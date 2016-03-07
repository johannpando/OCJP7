package com.johannpando.chapter5;

import java.util.Formatter;

/**
 * The uppercase version %S, is same as %s, except that all the lower case
 * letters in the string are converted into uppercase. So "HELLO123" is printed.
 * Since the method is used correctly here, there are no compiler error or
 * exception here. So choices C and D are also incorrect.
 * 
 * @author jpandode
 *
 */
public class Question2 {

	public static void main(String[] args) {
		String s = "hello123";
		Formatter f = new Formatter();
		f.format("%S", s);
		System.out.println(f);
	}
	//Prints: HELLO123
}
