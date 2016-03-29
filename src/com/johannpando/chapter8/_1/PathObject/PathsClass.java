package com.johannpando.chapter8._1.PathObject;

import java.io.File;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathsClass {

	public static void main(String[] args) {

		// A Path object can refer to a nonexistent file or directory.
		System.out.println(Paths.get("C:/FOLDER_NOT_EXIST/NO"));
		System.out.println(FileSystems.getDefault().getPath(
				"C:/FOLDER_NOT_EXIST/NO"));

		// Creating Path objects by using File class.
		File file = new File("Hello.txt");
		Path path = file.toPath();
		System.out.println(path);

		Path path1 = Paths.get("");
		System.out.println(path1.toString());
		System.out.println(path1.toAbsolutePath());
	}

}
