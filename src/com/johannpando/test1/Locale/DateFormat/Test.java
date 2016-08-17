package com.johannpando.test1.Locale.DateFormat;

public class Test {

	public static void main(String[] args) {
		Test t = new Test();
		System.out.println(t.solution());

	}

	/**
	 * Método returnInterface tiene como parámetro un tipo Foo que es una
	 * interface, pero en tiempo de ejecución se pasará la clase que la
	 * implementa, sin embargo, en este caso nadie implementa la interfaz por lo
	 * quye necesitamos crear una Anonymus Inner Class.
	 * 
	 * @param i
	 * @return
	 */
	public int returnInterface(Foo foo) {
		return foo.bar();
	}

	/**
	 * Método que contendrá la Anonymus Inner Class
	 */
	public int solution() {
		return returnInterface(new Foo() {
			@Override
			public int bar() {
				return 1;
			}
		});
	}
}

// Interface foo define un método llamado 'bar' que devuelve un int
interface Foo {
	int bar();
}
