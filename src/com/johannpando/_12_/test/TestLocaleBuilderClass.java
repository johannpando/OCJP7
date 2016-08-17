package com.johannpando._12_.test;

import java.util.Locale;

/**
 * Inner Class Builder of the Class Locale since 1.7
 * 
 * @author Johann
 *
 */
public class TestLocaleBuilderClass {

	public static void main(String[] args) {

		// --------------------------------------------------------------

		// print output 'Canada'

		// OK
		Locale CAN = new Locale.Builder().setLanguage("en").setRegion("CA").build();
		System.out.println(CAN.getDisplayCountry());

		// KO
		// Is incorrect as we have only passed the language string when
		// constructing "CAN" so it'll print nothing as country.

		Locale CAN1 = new Locale("ca");
		System.out.println(CAN1.getDisplayCountry());

		// OK
		Locale CAN2 = Locale.CANADA;
		System.out.println(CAN2.getDisplayCountry());

		// --------------------------------------------------------------

		// Correct use of DisplayLanguage and DisplayCountry

		Locale loc = new Locale.Builder().setLanguage("en").build();

		System.out.println(loc.getDisplayLanguage(new Locale("En")));
		// As we failed to set region of 'loc' object calling
		// getDisplayCountry(); method will return empty string.
		System.out.println(" - " + loc.getDisplayCountry(new Locale("En")));

		// --------------------------------------------------------------

		// Correct use of constructors of class Locale

		String language = "en";
		String country = "US";
		Locale locale = new Locale(language, country);
		System.out.println("locale: " + locale);
		System.out.println("language: " + locale.getLanguage());
		System.out.println("country: " + locale.getCountry());
		System.out.println("displaylanguage: " + locale.getDisplayLanguage());
		System.out.println("displaycountry: " + locale.getDisplayCountry());

		// locale: en_US
		// language: en
		// country: US
		// displaylanguage: ingl�s
		// displaycountry: Estados Unidos

		// KO

		Locale localeWrong = new Locale(country, language);
		System.out.println("locale: " + localeWrong);
		System.out.println("language: " + localeWrong.getLanguage());
		System.out.println("country: " + localeWrong.getCountry());
		System.out.println("displaylanguage: " + localeWrong.getDisplayLanguage());
		System.out.println("displaycountry: " + localeWrong.getDisplayCountry());

		// locale: us_EN
		// language: us
		// country: EN
		// displaylanguage: us
		// displaycountry: EN

		// --------------------------------------------------------------

		Locale localeNothing = new Locale.Builder().build();
		System.out.println(localeNothing.getDisplayLanguage(new Locale("En")));
		System.out.println(" - " + localeNothing.getDisplayCountry(new Locale("En")));

	}

}
