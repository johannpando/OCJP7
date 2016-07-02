package com.johannpando.chapter12.test;

import java.util.Enumeration;
import java.util.Locale;
import java.util.ResourceBundle;

public class TestListResourceBoundleClass {
	public static void main(String[] args) {
		LRBundel_de lrb = new LRBundel_de();
		lrb.getContents();

		Locale locale = new Locale("de");
		ResourceBundle rb = ResourceBundle.getBundle("com.johannpando.chapter12.test.LRBundel_de", locale);
		Enumeration<String> bundleKeys = rb.getKeys();
		while (bundleKeys.hasMoreElements()) {
			String key = bundleKeys.nextElement();
			String value = rb.getString(key);
			System.out.println("key = " + key + ", " + "value = " + value);
		}
	}
}

// class LRBundel_de extends ListResourceBundle {
//
// @Override
// protected Object[][] getContents() {
// Object[][] resources = new Object[2][2];
// resources[0][0] = "Table";
// resources[0][1] = "Tisc";
// resources[1][0] = "Pen";
// resources[1][1] = "Feder";
// return resources;
// }
//
// }
