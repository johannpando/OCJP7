package com.johannpando.chapter11.test;

import java.util.concurrent.atomic.AtomicInteger;

public class TestAtomicIntegerAsign {

	public static void main(String[] args) {
		AtomicInteger ati = new AtomicInteger(10);
		
		// Imprimir 15
		
		// Error de compilación
		// Type mismatch: cannot convert from int to AtomicInteger
		//ati = 15;
		
		System.out.println(ati.addAndGet(5));
	}

}
