package com.johannpando._6_ExceptionsAssertions._61.useThrowAndThrows;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class PointsUsingThrowAndThrows {

	// A METHOD CAN HANDLE THE EXCEPTION AND STILL DECLARE IT TO BE THROWN
	void useReadFile(String name) throws FileNotFoundException {
		try {
			readFile(name);
		} catch (FileNotFoundException e) {
			throw e;
		}

	}

	// A METHOD THAT DECLARES A CHECKED EXCEPTION TO BE THROWN MIGHT NOT
	// ACTUALLY THROW IT
	public void readFile(String file) throws FileNotFoundException {
		System.out.println("readFile: " + file);
	}

	public static void main(String[] args) {
		// It confirms that whenever you use a method that declares to throw a
		// checked exception, you must accomplish either of the following or
		// else your code not compile:
		// - A handle exception using a try-catch block.
		// - A declare exception by adding the exception to the exception list
		// or throws clause.
		// new PointsUsingThrowAndThrows().readFile(null);
		
		unreachableStatement();
	}

	// YOU CAN RETHROW EXCEPTIONS WITH MORE-INCLUSIVE TYPE CHECKING
	public void compile() throws IOException, SQLException {
		String source = "DBMS";
		try {
			if (source.equals("dbms")) {
				throw new IOException();
			} else {
				throw new SQLException();
			}
		} catch (Exception e) {
			throw e;
		}
	}

	public void notCompile() throws IOException, SQLException {
		String source = "DBMS";
		try {
			if (source.equals("dbms")) {
				throw new IOException();
			} else {
				throw new SQLException();
			}
		} catch (Exception e) {
			// No, it won’t. It would be a direct violation of the contract
			// between the declarations of exceptions
			// that method main() states to be throwing and what it actually
			// throws.

			// Catch block creates and throws Exception instance
			// throw new Exception;
		}
	}

	// A METHOD CAN DECLARE TO THROW ALL TYPES OF EXCEPTIONS, EVEN IF IT DOESN’T
	void method1() throws Error {
	}

	void method2() throws Exception {
	}

	void method3() throws Throwable {
	}

	void method4() throws RuntimeException {
	}

	void method5() throws FileNotFoundException {
	}

	// Though a try block can define a handler for unchecked exceptions not
	// thrown by it, it can't do so for checked exceptions (other than
	// Exception)

	void method6() {
		try {

		} catch (Error e) {

		}
	}

	void method7() {
		try {

		} catch (Throwable e) {

		}
	}

	// Unreachable catch block for FileNotFoundException. This exception is
	// never thrown from the try statement body
	void method8() {
		// try {
		//
		// } catch (FileNotFoundException e) {
		//
		// }
	}

	static void unreachableStatement() {
		int a = (int) (Math.random() * 4) + 1;
		if (a >= 2)
			return;
		else if (a < 2)
			return;
		System.out.println("code SHOULD NOT reach here");
	}

}
