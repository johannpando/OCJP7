package com.johannpando._12_.test;

import java.util.Enumeration;
import java.util.Locale;
import java.util.ResourceBundle;

public class TestResourceBoundle {

	public static void main(String[] args) {

		// NOTE: To load and use your resource bundles, correct placement of
		// your class file and resource bundle files is important.

		Locale locale = new Locale("de");
		String baseName = "SRBundel";
		ResourceBundle rb = ResourceBundle.getBundle(baseName, locale);
		Enumeration<String> bundleKeys = rb.getKeys();
		while (bundleKeys.hasMoreElements()) {
			String key = bundleKeys.nextElement();
			String value = rb.getString(key);
			System.out.println("key = " + key + ", " + "value = " + value);
		}

		// When resource bundles was load correct, print:

		// When we invoke "getKeys" method it will iterate all the elements till
		// it finish the base version of the especified ResourceBoundle
		// (SRBundel and SrBundel_de):

		// key = Pen, value = Feder
		// key = Table, value = Tisch
		// key = null, value = null

		// If not class present (properties.file)

		// Exception in thread "main" java.util.MissingResourceException: Can't
		// find bundle for base name SRBundel, locale de
		// at java.util.ResourceBundle.throwMissingResourceException(Unknown
		// Source)
		// at java.util.ResourceBundle.getBundleImpl(Unknown Source)
		// at java.util.ResourceBundle.getBundle(Unknown Source)
		// at
		// com.johannpando.chapter12.test.TestResourceBoundle.main(TestResourceBoundle.java:12)

	}
}
