package com.johannpando.test1.NIO;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.FileVisitor;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

public class Q59fileVisitorMethod {

	public static void main(String[] args) throws IOException {
		Path path = Paths.get("D:\\whizlabs");
		FileVisitor<Path> visitor = new Visitor();
		Files.walkFileTree(path, visitor);
	}

	private static final class Visitor extends SimpleFileVisitor<Path> {

		int i = 0;

		public FileVisitResult visitFile(Path file, BasicFileAttributes bfa)
				throws IOException {

			if (i % 2 == 0) {
				System.out.println(file + " ");
				i++;
			} else {
				System.out.println(file);
				i++;
			}

			return FileVisitResult.CONTINUE;
		}
	}

}
