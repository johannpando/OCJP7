package com.johannpando._6_ExceptionsAssertions._63.OverridingMethodsThatThrowExceptionsRules;

public class Rules {
	
	public static void main(String[] args) {
		rule1();
	}

	//RULE 1: IF A BASE CLASS METHOD DOESN’T DECLARE TO THROW A CHECKED EXCEPTION, AN
	//OVERRIDING METHOD IN THE DERIVED CLASS CAN’T DECLARE TO THROW A CHECKED EXCEPTION
	private static void rule1() {
		
		class Base{
			public void aMethod(){
				
			}
			public void noRuntimeException() throws RuntimeException{
				
			}
		}
		
		class Derived extends Base {
			public void noRuntimeExceptio() throws Error{
				
			}
		}
	}
}
