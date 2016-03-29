package com.johannpando.chapter8._1.PathObject;

import java.nio.file.FileSystems;
import java.nio.file.Path;

public class ManipulatePaths {

	public static void main(String[] args) {

		// Method getName(), getNameCount(), and subpath() don't use the root
		// directory of a path.

		// subpath might throw a IllegalArgumentException if a refers to an a
		// invalid position.

		Path path = FileSystems.getDefault()
				.getPath("C:\\OCPJava7\\8\\8-1.txt");
		System.out.println("toString() -> " + path.toString());
		System.out.println("getRoot() -> " + path.getRoot());
		System.out.println("getName(0)) -> " + path.getName(0));
		System.out.println("getName(1) -> " + path.getName(1));
		System.out.println("getFileName() -> " + path.getFileName());
		System.out.println("getNameCount() -> " + path.getNameCount());
		System.out.println("getParent() -> " + path.getParent());
		System.out.println("subpath(0,2) -> " + path.subpath(0, 2));
	}

	// toString() -> C:\OCPJava7\8\8-1.txt
	// getRoot() -> C:\
	// getName(0)) -> OCPJava7
	// getName(1) -> 8
	// getFileName() -> 8-1.txt
	// getNameCount() -> 3
	// getParent() -> C:\OCPJava7\8
	// subpath(0,2) -> OCPJava7\8

}
