package com.johannpando.chapter10.listing10_1;

/**
 * �Qu� pasa si sobreescribimos el m�todo start (nada nos lo impide)? R: No se
 * crea un hilo de ejecuci�n.
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
		// Al sobreescribir el m�todo start, se garantiza que la salida ser� de
		// forma secuencial, es decir, imprimir� siempre 'starting' y 'Dancing'
		// respectivamente.
	}

}
