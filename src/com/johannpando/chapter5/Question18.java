package com.johannpando.chapter5;

import java.util.Calendar;

public class Question18 {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		cal.set(2012, 11, 2);
		
		//Se requiere imprimir "December 2, 2012"
		
		// %tB --> for local prints ful name year month
		
		System.out.format("%tB %te, %tY", cal,cal,cal);
	}

}
