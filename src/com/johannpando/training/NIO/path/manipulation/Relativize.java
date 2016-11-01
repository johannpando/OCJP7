package com.johannpando.training.NIO.path.manipulation;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Relativize {

	public static void main(String[] args) {
		// goRelativizeWindows();
		goRelativizeUnix();
	}

	private static void goRelativizeUnix() {
		Path p1 = Paths.get("a/c");
		Path p2 = Paths.get("a/b");
		// a/c + a/b
		// a/c/a/b
		// c/b
		// ../b
		Path p3 = p1.relativize(p2);
		System.out.println(p3);
		// Imprime:: ../b

		Path p11 = Paths.get("/personal/readme.txt");
		Path p22 = Paths.get("/index.html");
		// /personal/readme.txt + /index.html - va a ser igual a
		// /personal/readme.txt/index.hmtml - por lo tanto
		// ../../index.html
		System.out.println(p11.relativize(p22));
		// Imprime:: ../../index.html

		Path p111 = Paths.get("/personal/casual/readme.txt");
		Path p222 = Paths.get("/personal/index.html");
		// /personal/casual/readme.txt/personal/index.html
		// casual/readme.txt/index.html
		// ../../index.html
		System.out.println(p111.relativize(p222));
		// Imprime:: ../../index.html

		Path pp1 = Paths.get("/personal/./photos//..//readme.txt");
		Path pp2 = Paths.get("/personal/index.html");
		// personal/./photos/../readme.txt/personal/index.html
		// ./photos/../readme.txt/index.html - El . cuenta también.
		// ../../../../index.html
		System.out.println(pp1.relativize(pp2));
		// Imprime:: ../../../../index.html

		// Si un path tiene un root y el otro no, IllegalArgumentException
		Path p12 = Paths.get("/folder1/index.html");
		Path p21 = Paths.get("index2.html");
		System.out.println(p12.relativize(p21));
	}

	private static void goRelativizeWindows() {
		Path p1 = Paths.get("c:\\personal\\.\\photos\\..\\readme.txt");
		Path p2 = Paths.get("c:\\personal\\index.html");
		Path p3 = p1.relativize(p2);
		System.out.println(p3);
	}

}
