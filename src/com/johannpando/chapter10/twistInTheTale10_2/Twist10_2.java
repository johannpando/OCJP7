package com.johannpando.chapter10.twistInTheTale10_2;

/**
 * En las aplicaciones multitarea no se puede predeterminar el orden de la
 * ejecución de subprocesos.
 * 
 * El orden de ejecución del lanzamiento de RuntimeException por los hilos main
 * y sin es aleatorio, sin embargo, la salida del texto 'Singing' es seguro que
 * sucederá antes que el hilo sing lance un RuntimeException.
 * 
 * @author Johann
 *
 */
public class Twist10_2 {

	public static void main(String[] args) {
		Thread sing = new Sing();
		sing.start();
		throw new RuntimeException("main");
	}

}

class Sing extends Thread {

	public void run() {
		System.out.println("Singing...");
		throw new RuntimeException("run");
	}
}