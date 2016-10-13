package com.johannpando.training.StringProcess;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ArgumentosImplicitos {

	public static void main(String[] args) {
		System.out.printf("%2$s %s %<s", "A", "B", "C");
		// B A A
		System.out.println();
		System.out.printf("%1$s %s %<s", "A", "B", "C");
		// A A A
		System.out.println("\n-------");
		jugandoConPattern();
		System.out.println("\n-------");
		jugandoDeNuevo();

		System.out.println("SIZE: " + "A;;B;;;;;;;".split(";").length);
	}

	static void jugandoConPattern() {
		Pattern p = Pattern.compile("ola");
		Matcher m = p.matcher("hola,caracola");
		while (m.find()) {
			System.out.println(m.start() + " - " + m.group());
		}
	}

	static void jugandoDeNuevo() {
		Pattern p = Pattern.compile("\\s[\\d][\\w]*\\s");
		Matcher m = p.matcher("12 3abc ab23");
		while (m.find()) {
			System.out.println(m.start() + " - " + m.group());
		}
	}

}
