package com.johannpando.test1.NIO;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Q62PathNormalizeMethod {

	public static void main(String[] args) {
		Path path1 = Paths.get("C:\\users\\whizlabs\\..\\..\\output");
		Path path2 = Paths.get("C:\\users\\.\\..\\output");
		Path path_1 = path1.normalize();
		Path path_2 = path2.normalize();
		System.out.println(path_1.toString());
		System.out.println(path_2.toString());
	}
}
