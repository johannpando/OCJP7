package com.johannpando.test1.Exceptions;

public class TestAfterFinally {

	public static void main(String[] args) {
		try {
			test();
			System.out.println("Despu�s de test");
		} catch (RuntimeException e) {
			System.out.println("RuntimeException");
		} finally {
			System.out.println("Finally");
		}
		System.out.println("Despu�s de trye/catch/finally");
	}

	static void test() {
		throw new RuntimeException();
	}

}
