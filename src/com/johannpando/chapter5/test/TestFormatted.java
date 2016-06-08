package com.johannpando.chapter5.test;

import java.util.MissingFormatWidthException;

public class TestFormatted {

	public static void main(String args[]) {
		float f = 12.4205f;
		int i = 10;

		// %[arg_index][flags][width][.precision] conversion char

		// %0 - Indica que la variable 'f' puede tener ceros a la izquierda.
		// 2 - Indica el tamaño.
		// .0 - Elimina la parte decimal.
		//

		try {
			System.out.printf("%02.0f%d", f, i);
		} catch (MissingFormatWidthException e) {
			System.out.printf("Excep");
		}

		// print: 1210

	}

}
