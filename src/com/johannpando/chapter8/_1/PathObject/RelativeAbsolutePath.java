package com.johannpando.chapter8._1.PathObject;

import java.nio.file.Path;
import java.nio.file.Paths;

public class RelativeAbsolutePath {

	public static void main(String[] args) {

		// Path is immutable and calling normalize() on a Path object doesn't
		// change its value.

		Path actualDirectory = Paths.get("").toAbsolutePath();
		System.out.println(actualDirectory);

		Path file = Paths.get("8-1.txt");
		Path path = file.toAbsolutePath();
		System.out.println(path);

		Path file1 = Paths.get("..\\8-1.txt");
		Path path1 = file1.toAbsolutePath();
		System.out.println(path1);

		Path file2 = Paths.get("\\..\\8-1.txt");
		Path path2 = file2.toAbsolutePath();
		System.out.println(path2);

		Path file3 = Paths.get("..\\..\\8-1.txt");
		Path path3 = file3.toAbsolutePath();
		System.out.println(path3);

		// C:\Users\Johann\Documents\GitHub\OCJP7
		// C:\Users\Johann\Documents\GitHub\OCJP7\8-1.txt
		// C:\Users\Johann\Documents\GitHub\OCJP7\..\8-1.txt
		// C:\..\8-1.txt
		// C:\Users\Johann\Documents\GitHub\OCJP7\..\..\8-1.txt

		System.out.println("Using method normalize:\n");

		actualDirectory = actualDirectory.normalize();
		path = path.normalize();
		path1 = path1.normalize();
		path2 = path2.normalize();
		path3 = path3.normalize();

		System.out.println(actualDirectory);
		System.out.println(path);
		System.out.println(path1);
		System.out.println(path2);
		System.out.println(path3);

		// C:\Users\Johann\Documents\GitHub\OCJP7
		// C:\Users\Johann\Documents\GitHub\OCJP7\8-1.txt
		// C:\Users\Johann\Documents\GitHub\8-1.txt
		// C:\8-1.txt
		// C:\Users\Johann\Documents\8-1.txt
	}

}
