package com.johannpando.chapter7._7_1.File;

import java.io.File;

public class CounterDirFiles {

	public static void main(String[] args) {
		File dir = new File("C:\\temp");
		if (dir.isDirectory()) {
			int fileCount = 0;
			int dirCount = 0;
			// Retrieves files and sub directories
			String[] list = dir.list();
			File item = null;
			for (String listItem : list) {
				// Creates File object
				item = new File(dir, listItem);
				if(item.isDirectory()){
					++dirCount;
				} else if(item.isFile()){
					++fileCount;
				}
			}
			System.out.println("Dir(s): " + dirCount);
			System.out.println("File(s): " + fileCount);
		} else {
			throw new IllegalArgumentException("Not a directory");
		}
	}

}
