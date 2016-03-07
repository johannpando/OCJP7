package com.johannpando.chapter5;

public class Question15 {

	public static void main(String[] args) {
		double d = 12.345;
		System.out.printf("|%7.3f|\n", d);//Print: | 12,345|
		System.out.printf("|%3.7f|\n", d);//Print: |12,3450000|
		System.out.printf("|%7f|\n", d);//Print: |12,345000|
		//Exception in thread "main" java.util.IllegalFormatConversionException: d != java.lang.Double
		//System.out.printf("|%7d|\n", d);
		//Exception in thread "main" java.util.IllegalFormatPrecisionException: 7
		System.out.printf("|%3.7d|\n", d);
	}

}
