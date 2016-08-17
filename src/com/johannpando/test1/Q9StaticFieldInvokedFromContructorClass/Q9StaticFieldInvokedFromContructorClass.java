package com.johannpando.test1.Q9StaticFieldInvokedFromContructorClass;

public class Q9StaticFieldInvokedFromContructorClass {

	static int count;

	public Q9StaticFieldInvokedFromContructorClass() {
		count++;
	}

	public static void main(String[] args) {
		new Q9StaticFieldInvokedFromContructorClass();
		System.out.println(count);
		Q9TestClass tc = new Q9TestClass();
		tc.metodo();

	}
}

class Q9TestClass {

	void metodo() {
		System.out.println(Q9StaticFieldInvokedFromContructorClass.count);
	}
}