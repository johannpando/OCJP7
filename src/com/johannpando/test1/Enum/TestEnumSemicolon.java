package com.johannpando.test1.Enum;

public class TestEnumSemicolon {

	enum Employee {
		MANAGER, CLERK, SECRETARY
	}

	static void estatico() {
		System.out.println("Inside TestEnumSemicolon");
	}

	public static void main(String[] args) {
		TestEnumSemicolon t = new Help();
		t.estatico();
	}
}

class Help extends TestEnumSemicolon {
	static void estatico() {
		System.out.println("Inside Help");
	}
}
