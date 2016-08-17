package com.johannpando.chapter10.listing10_1;

/**
 * ¿Qué pasa si sobreescribimos el método start (nada nos lo impide)? R: No se
 * crea un hilo de ejecución.
 * 
 * @author Johann
 *
 */
public class SingingII extends Thread {

	public void run() {
		System.out.println("Singing...");
	}

	public void start() {
		System.out.println("starting...");
	}

	public static void main(String[] args) {
		Thread sing = new SingingII();
		sing.start();
		System.out.println("Dancing...");
		// Al sobreescribir el método start, se garantiza que la salida será de
		// forma secuencial, es decir, imprimirá siempre 'starting' y 'Dancing'
		// respectivamente.
	}

}
