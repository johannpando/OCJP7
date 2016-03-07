package com.johannpando.chapter5;

import java.util.regex.Pattern;

/**
 * <p>
 * Explanation :<br>
 * Option A is the correct answer.<br>
 * <br>
 * The Pattern class defines an alternate compile method that accepts a set of
 * flags affecting the way the pattern is matched. There are nine flags but in
 * this case have to use following two flags for gaining expected output.<br>
 * <br>
 * Pattern.CASE_INSENSITIVE - Enables case-insensitive matching.<br>
 * <br>
 * Pattern.COMMENTS - Permits whitespace and comments in the pattern. In this
 * mode, whitespace is ignored, and embedded comments starting with # are
 * ignored until the end of a line. <br>
 * <br>
 * We need to use these two flags because the regex strings contains spaces so
 * we have to pass Pattern.COMMENTS flag to ignore them. Then we have to pass
 * <br>
 * Pattern.CASE_INSENSITIVE flag as the input string contains different
 * combinations of capitals and simple of “tn”. So option A is correct.<br>
 * <br>
 * Other options are incorrect as explained above.<br>
 * <br>
 * 
 * @author jpandode
 *
 */
public class Question3 {

	private static final String REGEX = "t n ";
	private static final String INPUT = "TNTtnENTn ";

	public static void main(String[] args) {

		Pattern p = Pattern.compile(REGEX, Pattern.CASE_INSENSITIVE | Pattern.COMMENTS);
		String[] items = p.split(INPUT);
		for (String string : items) {
			System.out.print(string);
		}
		//Print: TEN
	}

}
