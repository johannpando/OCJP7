package com.johannpando.training.NIO.path.manipulation;

import java.nio.file.Path;
import java.nio.file.Paths;

public class ResolveSibling {

	public static void main(String[] args) {
		Path p1 = Paths.get("/personal/folder1/readme.txt");
		Path p2 = p1.resolveSibling("readme2.txt");
		System.out.println(p2);
		// Imprime:: /personal/folder1/readme2.txt
	}

}
