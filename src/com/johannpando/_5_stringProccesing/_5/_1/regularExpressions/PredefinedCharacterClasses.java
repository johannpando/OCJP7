package com.johannpando._5_stringProccesing._5._1.regularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * <ul>
 * <li><strong>.</strong> Any character (may or may not match line terminators)
 * </li>
 * <li><strong>\d</strong> A digit [0-9]</li>
 * <li><strong>\D</strong> A non digit [^0-9]</li>
 * <li><strong>\s</strong> A whitespace character</li>
 * <li><strong>\S</strong> A nonwhitespace character [^\s]</li>
 * <li><strong>\w</strong> A word character [a-zA-Z_0-9]</li>
 * <li><strong>\W</strong> A non word character [^\w]</li>
 * </ul>
 * 
 * @author Johann
 *
 */
public class PredefinedCharacterClasses {

	public static void main(String[] args) {

		dot();
		whitespace();
	}

	private static void whitespace() {
		String target = "		";
		String regex = "\\t";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(target);
		while (m.find()) {
			System.out.println("\\t" + m.group() + "\\t");
		}
	}

	private static void dot() {
		String target = "1.3 1m3 1,3 111";
		String regex = "1.3";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(target);
		while (m.find()) {
			System.out.println(m.group());
		}
	}

}
