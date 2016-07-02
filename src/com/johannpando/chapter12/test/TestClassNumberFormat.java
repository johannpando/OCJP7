package com.johannpando.chapter12.test;

import java.text.NumberFormat;
import java.util.Locale;

public class TestClassNumberFormat {

	public static void main(String[] args) throws Exception {

		// KO - Compile but throw exception
		// NumberFormat nf1 = NumberFormat.getInstance(Locale.US);
		// Number number = nf1.parse("$5,000.56");

		// Exception in thread "main" java.text.ParseException: Unparseable
		// number: "$5,000.56"
		// at java.text.NumberFormat.parse(Unknown Source)
		// at
		// com.johannpando.chapter12.test.TestClassNumberFormat.main(TestClassNumberFormat.java:12)

		// OK compiles and run correct

		NumberFormat nf2 = NumberFormat.getCurrencyInstance(Locale.US);
		Number number = nf2.parse("$5,000.56");

	}

}
