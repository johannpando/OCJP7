package com.johannpando.chapter8._1.PathObject;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Imagine you need a path to construct a path between two Path objects. To do
 * so, you can use method relativize(). It can be used to construct a path
 * between two relative or absolute Path objects:
 * 
 * @author jpandode
 *
 */
public class RelativizeMethodPathClass {

	public static void main(String[] args) {

		// RELATIVE PATHS
		Path dir = Paths.get("code");
		Path file = Paths.get("code/java/IO.java");
		System.out.println(file.relativize(dir));
		System.out.println(dir.relativize(file));

		// ..\..
		// java\IO.java

		// ABSOLUTE PATHS
		dir = Paths.get("/code");
		file = Paths.get("/java/IO.java");
		System.out.println(file.relativize(dir));
		System.out.println(dir.relativize(file));

		// ..\..\code
		// ..\java\IO.java

	}

}
