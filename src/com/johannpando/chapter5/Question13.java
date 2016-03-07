package com.johannpando.chapter5;

/**
 * <p id="yui_3_13_0_4_1457118553260_312">
 * Option E gives line 12 as String regex = “\\.\\s*”. This regular expression
 * is explained as follows. In regular expressions, “.” means a any single
 * alphanumeric character. So, to consider a “.” Character we have to escape it
 * with “\”. But again, there are also special characters like new line “\n” in
 * Java. So, to overcome this hurdle, we again have to escape the “\” with a
 * “\”. So “\\.” considers a single dot character. Also “\s” stands for a single
 * space character in regular expressions. But again in Java, we have to escape
 * it with “\”. So, “\\s” considers a single whitespace character. Further
 * “\\s*” considers one or more whitespace characters. Finally, “\\.\\s*” means
 * that a dot character followed by one or more whitespace characters will be
 * the regular expression used to split the string into substrings. This gives
 * the desired output. So, option E is the correct answer.<br>
 * <br>
 * References:<br>
 * <a href="http://docs.oracle.com/javase/tutorial/essential/regex/pattern.html"
 * target="_blank">http://docs.oracle.com/javase/tutorial/essential/regex/
 * pattern.html</a>
 * </p>
 * 
 * @author jpandode
 *
 */
public class Question13 {

	public static void main(String[] args) {
		String input = "Test A. Test B. Test C.";
		String regex = "\\.\\s*";

		String[] result = input.split(regex);
		for (String string : result) {
			System.out.print(string + " ");
		}
		
		// Invalid escape sequence (valid ones are  \b  \t  \n  \f  \r  \"  \'  \\ )
		//input.split("\s");

	}

}
