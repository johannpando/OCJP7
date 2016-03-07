package com.johannpando.chapter5;

import java.util.MissingFormatWidthException;

public class Question19 {

	/**
	 * As above explained using 0, we indicates that variable 'f' can have
	 * leadings zeros, and it's not the width. With is defined as 2. By using 0
	 * as the precision value we have removed the numbers after decimal point.
	 * Then we have placed the integer value as normal by using only 'd'
	 * conversion char.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		float f = 12.4205f;
		int i = 10;

		try {
			System.out.printf("%02.0f%d", f, i);
		} catch (MissingFormatWidthException e) {
			System.out.printf("Exception");
		}
	}

}
