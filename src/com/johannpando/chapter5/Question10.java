package com.johannpando.chapter5;

public class Question10 {

	public static void main(String[] args) {

		StringBuilder sb1 = new StringBuilder("123");
		String s1 = "123";
		// Necesitamos imprimir "123abc 123ac"
		
		sb1.append("abc");
		//s1 = s1 + s1.concat("abc");//Imprime 123123abc
		//s1 = s1.concat("abc");//Imprime 123abc
		s1.concat("abc");//No imprime
		
		
		System.out.println(sb1 + " " + s1);
		
	}

}
