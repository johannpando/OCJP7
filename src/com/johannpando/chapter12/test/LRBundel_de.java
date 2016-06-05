package com.johannpando.chapter12.test;

import java.util.ListResourceBundle;

public class LRBundel_de extends ListResourceBundle {

	@Override
	protected Object[][] getContents() {
		Object[][] resources = new Object[2][2];
		resources[0][0] = "Table";
		resources[0][1] = "Tisc";
		resources[1][0] = "Pen";
		resources[1][1] = "Feder";
		return resources;
	}

}
