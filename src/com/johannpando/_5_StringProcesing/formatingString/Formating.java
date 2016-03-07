package com.johannpando._5_StringProcesing.formatingString;

/**
 * <table>
 * <td>Format specifier element>
 * <td>Optional/Required></td>What it means</td>
 * <tr>
 * argument_index>
 * </tr>
 * <tr>
 * Optional>
 * <tr>
 * </tr>
 * Decimal integer indicating the position of the argu- ment in the argument
 * list. The first argument is refer- enced by 1$, the second by 2$, and so
 * forth.
 * </tr>
 * </table>
 * 
 * <p>
 * %[argument_index$][flags][width][.precision]conversion_char
 * </p>
 * <p>
 * NOTE The conversion characters on the exam are %b, %c, %d, %f ,and %s.
 * </p>
 * <ul>
 * <li><strong>%b </strong>boolean</li>
 * <li><strong>%c </strong>Character unicode</li>
 * <li><strong>%d </strong>boolean</li>
 * <li><strong>%f </strong>boolean</li>
 * <li><strong>%s </strong>boolean</li>
 * </ul>
 * 
 * You need to remember the following flags:
 * <ul>
 * <li><strong>-</strong> Left-justify this argument; must specify width as
 * well.</li>
 * <li><strong>+</strong> Include a sign (+ or -) with this argument. Applicable
 * only if conversion char- acter is d or f (for numbers).</li>
 * <li><strong>0</strong> Pad this argument with zeros. Applicable only if
 * conversion character is d or f (for numbers). Must specify width as well.
 * </li>
 * <li><strong>,</strong> Use locale-specific grouping separators (for example,
 * the comma in 123,456). Applicable only if conversion character is d or f (for
 * numbers).</li>
 * <li><strong>(</strong> Enclose negative numbers in parentheses. Applicable
 * only if conversion char- acter is d or f (for numbers).</li>
 * </ul>
 * 
 * @author Johann
 *
 */
public class Formating {

	public static void main(String[] args) {
		formatinParamater_b();
		formatinParameter_c();
		formatingParameter_f_d();

	}

	private static void formatinParamater_b() {
		String name = "Shreya";
		Integer age = null;
		boolean isShort = false;

		System.out.format("Name %b, age %b, isShort %b", name, age, isShort);

		// Exception in thread "main" java.util.MissingFormatArgumentException:
		// Format specifier 'b'
		// System.out.format("Name %b, age %b", name);

		// Minimum width specified as 10
		System.out.format("\nName defined %10b.", name);
		// Precision 1 truncates length of result to t.
		System.out.format("\nName defined %.1b.", name);
		// Flag left- justifies the text true.
		System.out.format("\nName defined %-10b.", name);

		// Prints:
		// Name defined true
		// Name defined t
		// Name defined true
	}

	private static void formatinParameter_c() {
		System.out.format("\nChar %c", new Character('\u007b'));
		System.out.format("\nChar %c", '\u6124');
		// Exception in thread "main"
		// java.util.IllegalFormatConversionException: c != java.lang.Boolean
		// System.out.format("\nChar %c", new Boolean(true));
		// Not compile
		// System.out.format("\nChar %c", '\affff');
	}

	/**
	 * By default, %f prints six digits after the decimal.
	 */
	private static void formatingParameter_f_d() {

		// By default, %f prints six digits after the decimal.
		System.out.format("\n[%f]", 12.12345);

		System.out.format("\n[%010f]", 12.12345);// [12,123450]
		System.out.format("\n[%-10f]", 12.12345);// [012,123450]
		System.out.format("\n[%10.2f]", 12.12345);// [12,123450 ]
		System.out.format("\n[%,f]", 12.12345);// [12,123450]

		// No se pueden pasar valores enteros a f
		// Exception in thread "main"
		// java.util.IllegalFormatConversionException: f != java.lang.Integer
		// System.out.format("\n%f", 12345);

		System.out.println("\n\n");

		System.out.format("\n[%d]", 12345);
		// Outputs value with width 10, zero padded
		System.out.format("\n[%010d]", 12345);
		// Negative numbers enclosed within parentheses
		System.out.format("\n%(,d", -12345);
		// Exception java.util.IllegalFormatPreciosionException at runtime;
		// can't specify precision with integers
		//System.out.format("\n[%-10.2d]", 12345);
	}
	
	private static void formatingParameter_s(){
		
	}
}
