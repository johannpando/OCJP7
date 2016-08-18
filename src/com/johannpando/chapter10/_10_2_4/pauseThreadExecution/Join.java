package com.johannpando.chapter10._10_2_4.pauseThreadExecution;

public class Join {

	public static void main(String[] args) {
		ScreenDesign design = new ScreenDesign();
		// Empieza el hilo de ejecuci�n.
		design.start();
		Developer dev = new Developer(design);
		// Se ejecuta en el m�todo main e invoca a design.join
		dev.code();
	}

}

class ScreenDesign extends Thread {
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
	}
}

class Developer {

	// La clase Developer guarda una instancia a la clase Design
	ScreenDesign design;

	public Developer(ScreenDesign design) {
		this.design = design;
	}

	public void code() {
		try {
			System.out.println("Esperando a que design complete su tarea...");
			// El m�todo code llama a design.join
			design.join();
			System.out.println("Empieza la fase de codificaci�n...");
			// Join puede lanzar la siguiente excepci�n...
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
