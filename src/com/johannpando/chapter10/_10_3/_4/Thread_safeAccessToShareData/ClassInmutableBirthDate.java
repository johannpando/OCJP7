package com.johannpando.chapter10._10_3._4.Thread_safeAccessToShareData;

import java.util.Date;

/**
 * Aqu� un ejemplo de c�mo crear una clase inmutable
 * 
 * @author Johann
 *
 */

// Final Class no puede ser extendida.
public final class ClassInmutableBirthDate {

	// Instancia privada de variable
	private final Date birth;

	// El valor de las variables de instancia son �nicamente asignados durante
	// la instanciaci�n
	public ClassInmutableBirthDate(Date dob) {
		birth = dob;
	}

	// M�todo que retorna un clon de la instancia de variable
	public Date getBirthDate() {
		return (Date) birth.clone();
	}

	// M�todos que no permiten la modificaci�n de instancias de variables
	// privadas como birthDate;
	public boolean isOlder(Date other) {
		// C�lcula other con birth.
		return true;
	}
}
