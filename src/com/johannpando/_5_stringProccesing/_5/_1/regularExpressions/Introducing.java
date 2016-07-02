package com.johannpando._5_stringProccesing._5._1.regularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * If a matched string occupies index positions 1, 2, and 3 in a target string,
 * method end() of class Matcher returns the value 4 for the corresponding call
 * on end(). You can expect trick questions on this returned value on the exam.
 * 
 * @author Johann
 *
 */
public class Introducing {

	public static void main(String[] args) {
		String target = "I am fine to dine at dine";
		String regex = "[fdn]ine";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(target);
		while (m.find()) {
			System.out.println(m.group() + " starts at: " + m.start() + ", ends at: " + m.end());
		}
	}

}
