package com.johannpando.chapter5.test;

import java.text.DecimalFormat;

public class TestRegex {

	public static void main(String[] args) {
		quantifiers();

		ocurrences();

		decimalFormat1();
	}

	private static void decimalFormat1() {
		double d = 12345.61;
		// In this pattern, the pound sign(#) indicates a digit and the comma
		// (,) is a placeholder for grouping separator, in this case separating
		// is done for one digit so after each digit the separator will appear
		// till decimal separator. We have only used one “#” for decimal points
		// so it’ll only print one decimal point number. So the output will be
		// 1,2,3,4,5.6.

		DecimalFormat df = new DecimalFormat("#,#.#");
		System.out.println(df.format(d));
	}

	private static void ocurrences() {
		String input = "aaaaaaaaabb";
		// Here, the regular expression a{3} is searching for three occurrences
		// of the letter "a" in a row.
		String regex = "a{3}";
		String[] result = input.split(regex);
		for (String r : result) {
			System.out.println(r);
		}
		System.out.println(result.length);
	}

	private static void quantifiers() {
		String input = "Test A. Test B. Test C.";
		// Further “\\s*” considers one or more whitespace characters. Finally,
		// “\\.\\s*” means that a dot character followed by one or more
		// whitespace characters will be the regular expression used to split
		// the string into substrings.
		String regex = "\\.\\s*";
		String[] result = input.split(regex);
		for (String r : result) {
			System.out.println(r);
		}
	}

}
