package com.johannpando.training.NIO.path.manipulation;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Normalize {

	public static void main(String[] args) {
		normalizeUnix();
	}

	private static void normalizeUnix() {
		Path p1 = Paths.get("/personal/./photos/../readme.txt");
		Path p2 = p1.normalize();
		// . es redundante y se elimina por sí mismo.
		// .. es un parent folder.
		System.out.println(p2);
		// Imprime /personal/readme.txt

		Path p3 = Paths.get("/../temp/text.txt");
		// En este caso .. está en el nivel más alto y no tiene un parent
		// directory por lo que es redundante.
		System.out.println(p3.normalize().toUri());
		// Imprime:: file:///temp/text.txt
	}

}
