package com.johannpando.chapter8._1.PathObject;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * 
 * Imagine you need to retrieve the path to a file in the same directory, say,
 * to create its copy or to rename it. To do so, you can use the overloaded
 * methods resolveSibling(String) and resolveSibling(Path). These resolve a
 * given path against a paths's parent.
 * 
 * @author jpandode
 *
 */
public class ResolveSiblingMethodPathClass {

	public static void main(String[] args) {
		Path path = Paths.get("/myDir/eWorld.java");
		Path renamePath = path.resolveSibling(Paths.get("newWorld.java"));
		Path copyPath = path.resolveSibling("backup/eWorld.java");
		Path absolutePath = Paths.get("E:/OCPJavaSE7");

		System.out.println(renamePath);
		System.out.println(copyPath);
		// If you pass it an empty path, it returns the parent of the path:
		System.out.println(path.resolveSibling(""));

		System.out.println(absolutePath.resolveSibling(path));
		// If the given path is an absolute, this method returns the absolute
		// path.
		System.out.println(path.resolveSibling(absolutePath));

		// \myDir\newWorld.java
		// \myDir\backup\eWorld.java
		// \myDir
		// E:\myDir\eWorld.java
		// E:\OCPJavaSE7

	}

}
