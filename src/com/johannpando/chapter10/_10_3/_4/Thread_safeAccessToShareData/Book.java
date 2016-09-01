package com.johannpando.chapter10._10_3._4.Thread_safeAccessToShareData;

public class Book {

	double rank = 0;
	int copiesSold = 0;

	// Hilos adquieren el cerrojo en el monitor de estos objetos para
	// ejecutar sentencias sincronizadas en métodos newSale y rankImprove.

	Object objSale = new Object();
	Object objPos = new Object();

	public void newSale() {
		// Un hilo que executa newSale() debe adquirir el cerrojo sobre el
		// objeto objSale antes de poder ejecutar la sentencia sinronizada .
		synchronized (objSale) {
			++copiesSold;
		}
	}

	// Método de instancia que incluye una sentencia sincronizada que manipula
	// la variable de instancia 'rank'
	public void rankImprove() {
		synchronized (objPos) {
			--rank;
		}
	}
}
