package com.johannpando.chapter12.test;

import java.text.DateFormat;
import java.util.Locale;

public class TestDateFormatClass {

	private static int style;
	private static Locale aLocale;

	public static void main(String[] args) {

		// You asked to create a DateFormat object considering following facts.

		// Style should be LONG
		// It can be used to print date in FRENCH

		// KO

		// DateFormat class there is no constant called as France
		// style = DateFormat.FRANCE;
		// Locale class there is no constant LONG
		// aLocale = Locale.LONG;
		// DateFormat df1 = DateFormat.getDateInstance(style, aLocale);

		// The method getInstance() in the type DateFormat is not applicable for
		// the arguments (int, Locale)
		// DateFormat df2 = DateFormat.getInstance(style, aLocale);

		// KO, wrong order in parameters
		// The method getDateInstance(int, Locale) in the type DateFormat is not
		// applicable for the arguments (Locale, int)
		// DateFormat df3 = DateFormat.getDateInstance(aLocale, style);

		// OK

		style = DateFormat.LONG;
		aLocale = new Locale("fr");

		DateFormat dfOK = DateFormat.getDateInstance(style, aLocale);
		System.out.println(dfOK);

	}

}
