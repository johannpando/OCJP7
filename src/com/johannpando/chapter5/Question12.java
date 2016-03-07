package com.johannpando.chapter5;

/**
 * <p>
 * Explanation :<br>
 * The correct answers are option B.<br>
 * <br>
 * The given code fragment depicts a class TestString which has the main method
 * in which a variable s is printed. We have to find the type of s and the
 * operations done on it so that the output is 4247.<br>
 * <br>
 * The options given in the above question use StringBuilder and StringBuffer
 * classes. These classes are introduced in Java to counteract the immutability
 * of String class. The StringBuilder and StringBuffer class methods return the
 * same StringBulider or StringBuffer object so that it can be mutated again.
 * <br>
 * <br>
 * However, in case of String, a new String object is created and returned as
 * the output of a String class method. The difference between StringBuilder and
 * StringBuffer is only that the methods of the StringBuffer class are
 * synchronized hence thread-safe, whereas those of StringBuilder are not.
 * Hence, StringBuilder is also faster.<br>
 * <br>
 * Option B and C create StringBuffer and StringBuilder objects by passing
 * string “123456789” to their respective constructors as parameter
 * respectively.<br>
 * <br>
 * In option B, the delete method in StringBuffer takes the index from and to
 * which the substring of the input string needs to be removed exclusive of the
 * last index character. So, delete(0,3) gives the string “456789”. The replace
 * method in StringBuffer takes the index from and to which the substring of the
 * input string needs to be replaced inclusive of the last index character and
 * replaces it by the replacement string. So, replace(1,3,”24”) converts the
 * string to “424789”. Then delete(4,6) gives the output as “4247”. Hence, B is
 * an answer.<br>
 * <br>
 * In option C, the substring method in StringBuilder takes the index from and
 * to which the substring of the input string needs to be considered inclusive
 * of the last index character. So, substring(3,6) gives the string “4567”. But
 * String class doesn't define a delete method, so trying to invoke deleete
 * method on returned String causes a compile time error, option C is incorrect.
 * <br>
 * <br>
 * Option A uses “-” binary arithmetic operator on strings which is illegal. So,
 * option A is not an answer.<br>
 * <br>
 * Option D and E call the StringBuffer and StringBuilder methods directly
 * without any object reference which gives compilation error.<br>
 * So, Option D and E are invalid answers.<br>
 * <br>
 * References:<br>
 * </p>
 * 
 * @author jpandode
 *
 */
public class Question12 {

	public static void main(String[] args) {

		Integer x = 400;
		Integer y = x;
		x++;
		StringBuilder sb1 = new StringBuilder("123");
		StringBuilder sb2 = sb1;
		sb1.append("5");
		System.out.println((x == y) + " " + (sb1 == sb2));

		System.out.println("Valor de x: " + x);
		System.out.println("Valor de y: " + y);
		System.out.println("Valor de sb1: " + sb1);
		System.out.println("Valor de sb2: " + sb2);
	}

}
