package com.johannpando.training.NIO.path.manipulation;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Resolve {

	public static void main(String[] args) {
		resolveUnix();

	}

	private static void resolveUnix() {
		Path p1 = Paths.get("/photos/vacation");
		Path p2 = Paths.get("/yellowstone");
		// Relativize
		// photos/vacation/yellowstone
		// ../../yellowstone

		// Resolve
		// Como el argumento a resolver comienza con /, el resultado será el
		// mismo que el argumento. Si el argumento no comienza con un / (o no
		// comienza con una raíz como c\:), la salida es el resultado al agregar
		// el argumento a la ruta en la que se invoca el método.

		System.out.println(p1.relativize(p2) + " - " + p1.resolve(p2));
		// Imprime:: ../../yellowstone - /yellowstone

		p1 = Paths.get("home");
		p2 = Paths.get("yellowstone");
		System.out.println(p1.resolve(p2));
		// Imprime:: home/yellowstone
	}

}
