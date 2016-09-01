package com.johannpando.chapter10._10_3._4.Thread_safeAccessToShareData;

import java.util.Date;

/**
 * Aquí un ejemplo de cómo crear una clase inmutable
 * 
 * @author Johann
 *
 */

// Final Class no puede ser extendida.
public final class ClassInmutableBirthDate {

	// Instancia privada de variable
	private final Date birth;

	// El valor de las variables de instancia son únicamente asignados durante
	// la instanciación
	public ClassInmutableBirthDate(Date dob) {
		birth = dob;
	}

	// Método que retorna un clon de la instancia de variable
	public Date getBirthDate() {
		return (Date) birth.clone();
	}

	// Métodos que no permiten la modificación de instancias de variables
	// privadas como birthDate;
	public boolean isOlder(Date other) {
		// Cálcula other con birth.
		return true;
	}
}
