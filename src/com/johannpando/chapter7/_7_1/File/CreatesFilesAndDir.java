package com.johannpando.chapter7._7_1.File;

import java.io.File;
import java.io.IOException;

public class CreatesFilesAndDir {

	public static void main(String[] args) throws IOException {
		File dirs = new File("c:\\temp\\ocp7\\data");
		// Creates multiple directories in root directory.
		System.out.println("Creates directories?: " + dirs.mkdirs());
		File file = new File(dirs, "MyText.txt");
		if (!file.exists()) {
			// Try to create file.
			System.out.println("Create file?: " + file.createNewFile());
		}
	}

}
