package com.johannpando.chapter10._10_2_4.pauseThreadExecution;

public class YieldProcessorTime {

	public static void main(String[] args) {
		Thread sing = new Sing();
		sing.start();
		// Puede causar que el hilo main ceda su tiempo de procesador.
		Thread.yield();
	}

}

class Sing extends Thread {
	public void run() {
		// Cuando se ejecuta, puede causar que el hilo 'sing' ceda su tiempo de
		// procesador.
		yield();
		System.out.println("Singing...");
	}
}