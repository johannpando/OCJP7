package com.johannpando._11_.test;

import java.util.concurrent.atomic.AtomicInteger;

public class TestAtomicIntegerAsign {

	public static void main(String[] args) {
		AtomicInteger ati = new AtomicInteger(10);
		
		// Imprimir 15
		
		// Error de compilaci�n
		// Type mismatch: cannot convert from int to AtomicInteger
		//ati = 15;
		
		System.out.println(ati.addAndGet(5));
	}

}
