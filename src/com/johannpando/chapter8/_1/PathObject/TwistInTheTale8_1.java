package com.johannpando.chapter8._1.PathObject;

import java.nio.file.Path;
import java.nio.file.Paths;

public class TwistInTheTale8_1 {

	public static void main(String[] args) {
		// The correct path is: c:\OCPJava7\8\

		Path path = Paths.get("c:\\OCPJava7\\..\\8\\.\\8-1.txt");

		// Tal cual
		System.out.println(path.toString());
		// OCPJava7
		System.out.println(path.getName(1));
		// c
		System.out.println(path.getParent());
		// Excepción
		System.out.println(path.subpath(2, 4));

		// c:\OCPJava7\..\8\.\8-1.txt
		// ..
		// c:\OCPJava7\..\8\.
		// 8\.

		// Methods toString(), getName(), getParent() and subpath() don't remove
		// any redundancies from the Path object. An example of a method that
		// removes a redundancy from a Path object is normalize(). Also, the
		// root element of a path isn't its first name element. The element
		// that's closest to the root in the directory hierarchy has index 0.

	}

}
