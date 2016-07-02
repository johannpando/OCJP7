package com.johannpando.test1.NIO;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.FileVisitor;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

public class Q60preVisitDirectoryMethod {

	public static void main(String[] args) throws IOException {

		Path path = Paths.get("D:\\whizlabs\\myfiles");
		FileVisitor<Path> fileVisitor = new Visitor();
		Files.walkFileTree(path, fileVisitor);

	}

	private static final class Visitor extends SimpleFileVisitor<Path> {

		public FileVisitResult preVisitDirectory(Path dir,
				BasicFileAttributes bfa) throws IOException {

			System.out.println(dir);
			return FileVisitResult.CONTINUE;
		}
	}
}
