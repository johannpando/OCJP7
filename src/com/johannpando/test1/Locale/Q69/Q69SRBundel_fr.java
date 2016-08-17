package com.johannpando.test1.Locale.Q69;

import java.util.ListResourceBundle;

public class Q69SRBundel_fr extends ListResourceBundle {

	protected Object[][] getContents() {

		// NPE porque no se ha declarado el array [2][0]
		Object[][] resources = new Object[2][2];
		resources[0][0] = "Table";
		resources[0][1] = "Table in france";

		return resources;

	}
}