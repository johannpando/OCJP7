package com.johannpando.training.StringProcess;

public class StringTokenizer {

	public static void main(String[] args) {
		java.util.StringTokenizer st = new java.util.StringTokenizer("a aa aaa", "a");
		while (st.hasMoreTokens()) {
			System.out.println("#" + st.nextToken() + "#");

		}

		System.out.println("-------------------");

		java.util.StringTokenizer st2 = new java.util.StringTokenizer("abcde", "bc");
		while (st2.hasMoreTokens()) {
			System.out.println("#" + st2.nextToken() + "#");

		}
	}

}
