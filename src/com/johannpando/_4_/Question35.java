package com.johannpando._4_;

import java.util.Arrays;

/**
 * This results in s2 equal to the index of "orange" (2) from the sorted array
 * and s3 equal to -5 as the insertion point of "violet" would be 4 which is the
 * index of "yellow" before which "violet" would have been inserted and hence
 * index would we -(4) - 1 = - 5.
 * 
 * 
 * 
 * @author jpandode
 *
 */
public class Question35 {

	public static void main(String[] args) {

		String[] colors = { "blue", "red", "green", "yellow", "orange" };
		Arrays.sort(colors);
		int s2 = Arrays.binarySearch(colors, "orange");
		int s3 = Arrays.binarySearch(colors, "violeta");
		int s4 = Arrays.binarySearch(colors, "a");
		System.out.println(s2 + " " + s3 + " " + s4);
	}

}
