package com.johannpando.training.StringProcess;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternAndMatcher {

	public static void main(String[] args) {
		String str = " she sells sea shells";
		// Busca un "s" rodeada de "A non white space character"
		String regex = "\\Ss\\S";
		String replace = "X";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(str);
		String valor = m.replaceAll(replace);
		System.out.println(valor);
	}

}
