package com.johannpando.chapter7._7_1.File;

import java.io.File;

public class CounterDirFiles {

	public static void main(String[] args) {
		File file = new File("C:\\OCP");
		if (file.isDirectory()) {
			System.out.println(file.list());
		}
	}

}
