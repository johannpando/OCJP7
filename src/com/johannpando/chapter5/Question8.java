package com.johannpando.chapter5;

/**
 * The initial capacity of the StringBuilder is 16.
 * @author jpandode
 *
 */
public class Question8 {

	public static void main(String[] args) {
		StringBuilder s = new StringBuilder();
		System.out.println("StringBuilder capacity: " + s.capacity());
		//Print 16
		
		StringBuilder ss = new StringBuilder("Java");
		System.out.println("StringBuilder capacity: " + ss.capacity());
		//Print 20
	}

}
