package com.johannpando.chapter8._1.PathObject;

import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ComparePaths {

	public static void main(String[] args) {
		Path path1 = FileSystems.getDefault().getPath(
				"C:\\OCPJava7\\8\\8-1.txt");
		Path path2 = FileSystems.getDefault().getPath(
				"D:\\OCPJava7\\8\\8-1.txt");

		System.out.println(path1.compareTo(path2));
		System.out.println(path2.startsWith("\\"));

		System.out.println(path1.endsWith("-1.txt"));
		System.out.println(path1.endsWith(Paths.get("8-1.txt\\")));

		// -1
		// false
		// false
		// true
	}

}
