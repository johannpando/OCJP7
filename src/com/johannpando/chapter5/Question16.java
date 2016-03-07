package com.johannpando.chapter5;

/**
 * <p>
 * Explanation:<br>
 * Option A is the correct answer.<br>
 * <br>
 * When we create a formatted string we should always remember the construction
 * of format String, It�s,
 * </p>
 * 
 * <p id="yui_3_13_0_4_1457118553260_319">
 * Arg_index indicates which argument should be printed in its position and it
 * is declared using �$� mark (%$1). There are many flags available (refer the
 * reference link). <br>
 * For an example �.2� means two places after decimal point. Width value
 * indicates the minimum number of characters to print. Precision value
 * indicates the number of digits to print after the decimal point. Conversion
 * char indicates the type of argument we are going to formatting. (b � boolean,
 * c- char, d- integer etc).<br>
 * <br>
 * Option A is correct as it produce the expected output. And �%n� won�t cause
 * any problem as it is just new line character. <br>
 * <br>
 * Option B is incorrect as it produces the output as 1210<br>
 * <br>
 * Option C is incorrect as it produces the output as 10010<br>
 * <br>
 * Option D is incorrect as it produces the output as 10 12<br>
 * <br>
 * Reference : <br>
 * <a href="http://docs.oracle.com/javase/tutorial/java/data/numberformat.html"
 * id="yui_3_13_0_4_1457118553260_322"> http://docs.oracle.com/javase/tutorial/
 * java/data/numberformat.html </a>
 * </p>
 * 
 * @author jpandode
 *
 */
public class Question16 {

	public static void main(String[] args) {
		int one = 12;
		int two = 10;

		// En este ejemplo se requiere imprimir el texto: 10012

		// Caso 1
		caso1(one, two);

	}

	/**
	 * /**
	 * <ul>
	 * <li><strong>%2$ </strong> Sifnigica que coge el argumento número 2: 10
	 * </li>
	 * <li><strong>d </strong>Significa que es un formato numérico entro</li>
	 * <li><strong>%1$ </strong>Significa que coge el argumento número 1: 12
	 * </li>
	 * <li><strong>03d</strong>Significa el tamaño, que son 3, por ello, 12 se
	 * convierte en 012</li>
	 * </ul>
	 * @param one
	 * @param two
	 */
	private static void caso1(int one, int two) {
		System.out.printf("%2$d%1$03d %n", one, two);
	}

}
