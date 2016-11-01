package com.johannpando.training.NIO.path.manipulation;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathClass {

	public static void main(String[] args) {
		getRootUnix();
	}

	private static void getRootUnix() {
		Path p1 = Paths.get("/useryyyy/johannpando");
		System.out.println(p1.getRoot());
	}

}
