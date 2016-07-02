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
import java.util.regex.Pattern;

public class TestFileVisitorInterfaceMethodpostVisitorDirectory {

	static boolean f;

	public static void main(String[] args) throws IOException {
		Path path = Paths.get("I:\\whizlabs");
		FileVisitor<Path> searcher = new Search();
		// he “wakFileTree()” method visit all the files and subdirectories of
		// the given file root
		Files.walkFileTree(path, searcher);
		if (!f) {
			System.out.println("No matches");
		}
	}

	private static final class Search extends SimpleFileVisitor<Path> {

		// the “postVisitDirectory ()” method is invoked after the all entries
		// are visited.
		public FileVisitResult postVisitDirectory(Path dir, IOException e) throws IOException {
			Pattern p = Pattern.compile("...");
			// We can use “java.nio.file.PathMatcher” interface to perform match
			// operations on paths. To have a “PathMatcher”, we can use the
			// “getPathMatcher()” method in the “java.nio.file.FileSystem”
			// class. We should pass a String to the method and that String work
			// as the pattern for matching operations. We can use “regex” syntax
			// or “glob” syntax for matching, when we pass the pattern, using
			// the “regex:” prefix, we indicates that we are passing the “regex”
			// syntax. If we pass “glob” syntax, then we use the “glob:” prefix
			// to the pattern.

			// As we have passed the glob syntax “...”, there will be no
			// matching path because not like with regex syntax, with glob
			// syntax, “.” has no special meaning so this glob syntax only
			// matches with a names which are created with three “.”.

			// Completion succeeds and “No matches” will be printed as the
			// output.
			PathMatcher pm = FileSystems.getDefault().getPathMatcher("glob:...");
			if (pm.matches(dir.getFileName())) {
				System.out.println(dir);
				f = true;
			}
			return FileVisitResult.CONTINUE;
		}
	}
}
