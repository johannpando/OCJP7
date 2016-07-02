package com.johannpando.test1.NIO;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Q61PathgetRootSubPathMethods {

	public static void main(String[] args) {

		Path path1 = Paths.get("D:\\whizlabs\\java\\NIO");
		Path path2 = Paths.get("C:\\carpetaNoExiste");
		System.out.println(path2.toString() + " - getRoot: "
				+ path2.getRoot().toString());
		System.out.println(path1.toString() + "- subpath(0,3): "
				+ path1.subpath(0, 3).toString());
		Path path = Paths.get(path2.getRoot().toString(), path1.subpath(0, 3)
				.toString());
		System.out.println(path.toString());
	}
}
