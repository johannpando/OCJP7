package com.johannpando.test1.innerclass;

public class Q1TestScopeAnonymusInnerClass {

	void f() {
		System.out.println("Outer");
	}

	final void metodoFinal() {

	}

	public class InnerTest {
		public InnerTest() {
			System.out.println("Inner Constructor");
		}

		void f() {
			System.out.println("Inner f");
		}
	}

	public static void main(String[] args) {
		Q1TestScopeAnonymusInnerClass t = new Q1TestScopeAnonymusInnerClass();

		final Q1TestScopeAnonymusInnerClass tFinal = new Q1TestScopeAnonymusInnerClass();

		String variableNoFinal = "variableNoFinal";
		final String variableFinal = "variableFinal";

		// Anonymus Inner Class
		Q1TestScopeAnonymusInnerClass.InnerTest test = t.new InnerTest() {
			public void f() {
				// Compiled only if t is final. t no compile.
				// t.f();

				// Cannot refer to a non-final variable variableNoFinal inside
				// an inner class defined in a different method
				// System.out.println(variableNoFinal);

				System.out.println(variableFinal);

				tFinal.f();

				System.out.println("Sub Inner f");
			}

		};
		test.f();
	}
}
