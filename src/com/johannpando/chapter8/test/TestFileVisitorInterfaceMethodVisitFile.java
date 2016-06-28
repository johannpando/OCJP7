package com.johannpando.chapter8.test;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.FileVisitResult;
import java.nio.file.FileVisitor;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

public class TestFileVisitorInterfaceMethodVisitFile {

	public static void main(String[] args) throws IOException {
		Path path = Paths.get("I:\\whizlabs");
		FileVisitor<Path> searcher = new Search1();
		// he “wakFileTree()” method visit all the files and subdirectories of
		// the given file root
		Files.walkFileTree(path, searcher);
	}

	private static final class Search1 extends SimpleFileVisitor<Path> {

		public FileVisitResult visitFile(Path file, BasicFileAttributes bfa) throws IOException {
			// We can use “java.nio.file.PathMatcher” interface to perform match
			// operations on paths. To have a “PathMatcher”, we can use the
			// “getPathMatcher()” method in the “java.nio.file.FileSystem”
			// class. We should pass a String to the method and that String work
			// as the pattern for matching operations. We can use “regex” syntax
			// or “glob” syntax for matching, when we pass the pattern, using
			// the “regex:” prefix, we indicates that we are passing the “regex”
			// syntax. If we pass “glob” syntax, then we use the “glob:” prefix
			// to the pattern.

			// In a glob syntax the * character matches zero or more characters
			// of a name component without crossing directory boundaries
			PathMatcher pm = FileSystems.getDefault().getPathMatcher("glob:*");
			if (pm.matches(file.getFileName())) {
				System.out.println(file);
			}
			return FileVisitResult.CONTINUE;
		}
	}

	// A. Completion succeeds and prints the paths of all the files and the
	// subdirectories which are located in the “whizlabs” directory. Incorrect
	// B. Completion succeeds and prints only the paths of the files and sub
	// directories of the “whizlabs” directory.
	// C. Completion succeeds and prints only the paths of all the files which
	// are located in the “whizlabs” directory and its subdirectories.
	// D. An exception will be thrown at the runtime.
	// E. Compilation fails.

	// Option C is correct as the “wakFileTree()” method visit all the files and
	// subdirectories of the given file root, when each file is visited the
	// “visitFile()” method is invoked. Then the method compares the current
	// file with the “PathMatcher”. As we have pass the glob syntax “*” path of
	// the every file visited is get printed.

	// Option A and B are incorrect as we have only overridden the “visitFile()”
	// method of the “SimpleFileVisitor”, so path of directories won’t be
	// included in the output.

	// Option D is incorrect as we have given that the directory actually exists
	// and we have enough permission.

}
