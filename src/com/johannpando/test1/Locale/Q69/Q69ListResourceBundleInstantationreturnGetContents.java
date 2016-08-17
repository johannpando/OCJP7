package com.johannpando.test1.Locale.Q69;

import java.util.Locale;
import java.util.ResourceBundle;

public class Q69ListResourceBundleInstantationreturnGetContents {

	public static void main(String[] args) {
		String language = "fr";
		String country = "de";
		Locale loc = new Locale(language, country);
		// Cuando cargamos un ResourceBundle lo primero que se hace es cargar el
		// nombre base "SRBundel" seguido de language y country, es decir:
		// intenta buscar "SRBundel_de_fr", si no lo encuentra, como es el caso
		// actual, busca "SRBundel_fr", como lo encuentra, recupera su valor
		// asociado.
		ResourceBundle rb = ResourceBundle.getBundle(
				"com.johannpando.test1.Locale.Q69.Q69SRBundel", loc);
		System.out.println(rb.getString("Table"));
	}
}
