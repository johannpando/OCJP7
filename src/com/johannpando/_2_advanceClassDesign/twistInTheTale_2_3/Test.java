package com.johannpando._2_advanceClassDesign.twistInTheTale_2_3;

public class Test {

	{
		System.out.println(new Clase().finalVar);
	}
	
	public static void main(String[] args) {
		new Test();
	}

}

abstract class ClaseAbstracta{
	public final int finalVar;
	
	//Devuelve error porque ha de inicialiarse o bien en el constructor o en un bloque 
	// de inicialización
	
	{
		finalVar = 0;
	}
	
	public ClaseAbstracta() {
		//finalVar = 9;
	}
}

class Clase extends ClaseAbstracta{
	
	Clase() {
		super();
		//Originalmente estaba descomentado.
		//finalVar = 100;
	}
}