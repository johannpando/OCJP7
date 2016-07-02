package com.johannpando.test1.innerclass;

public class TestScopeAnonymusInnerClass {

	void f() {
		System.out.println("Outer");
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
		TestScopeAnonymusInnerClass t = new TestScopeAnonymusInnerClass();
		// Anonymus Inner Class
		TestScopeAnonymusInnerClass.InnerTest test = t.new InnerTest() {
			public void f() {
				// Compiled only if t is final.
				// t.f();
				System.out.println("Sub Inner f");
			}
		};
		test.f();
	}

}
