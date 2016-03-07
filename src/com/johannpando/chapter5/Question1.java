package com.johannpando.chapter5;

/**
 * <p>
 * The System.console() method returns the Console object for the current JVM.
 * The format() method of the Console class writes a formatted string to this
 * console's output stream using the specified format string and arguments.
 * </p>
 * 
 * <p>
 * The format argument %d is used to format as a decimal integer. To format as a
 * floating point value with one place after decimal point, we have the %1.1f
 * argument. Since the arguments are not actually multiplied, choice C is
 * incorrect. The other choices are also automatically incorrect.
 * </p>
 * 
 * @author jpandode
 *
 */
public class Question1 {

	public static void main(String[] args) {
		int i = 200;
		double d = 100.00;
		if(System.console() != null){
			System.console().format("%d * %1.1f", i, d);
		} else {
			System.out.format("%d * %1.1f", i, d);	
		}
	}

	// Prints: 200 * 100,0
}
