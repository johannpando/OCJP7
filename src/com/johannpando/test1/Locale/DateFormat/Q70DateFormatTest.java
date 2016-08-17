package com.johannpando.test1.Locale.DateFormat;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class Q70DateFormatTest {

	public static void main(String[] args) {
		DateFormat df = DateFormat.getDateInstance(DateFormat.LONG,
				Locale.FRANCE);
		String dateFrance = df.format(new Date());

		DateFormat dfs = DateFormat.getDateInstance(DateFormat.LONG,
				Locale.CHINESE);

		String dateChinese = dfs.format(new Date());

		System.out.println(dateFrance);
		System.out.println(dateChinese);

	}

}
