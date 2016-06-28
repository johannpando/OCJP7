package com.johannpando.test1.innerclass;

public final class TestInnerClassSemicolon {

	class Inner {
		void test() {
			// Thus even if the Test.this.bool returns false, myMethod() will be
			// invoked an thus "myMethod" will be printed.
			if (TestInnerClassSemicolon.this.bool)
				;
			{
				myMethod();
			}
		}
	}

	private boolean bool = false;

	public void myMethod() {
		System.out.println("myMehotd");
	}

	public TestInnerClassSemicolon() {
		(new Inner()).test();
	}

	public static void main(String[] args) {
		new TestInnerClassSemicolon();
	}

}
