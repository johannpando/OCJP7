package com.johannpando.chapter8._1.PathObject;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * The overloaded methods resolve (String) and resolve (Path) are used to join a
 * relative path to another path.
 * 
 * @author jpandode
 *
 */
public class ResolveMethodPathClass {

	public static void main(String[] args) {
		Path rootPathToAbsolutePath = Paths.get("").toAbsolutePath();
		System.out.println("RootPathToAbsolutePath::\t" + rootPathToAbsolutePath);
		Path path = Paths.get("/mydir/code");
		System.out.println(
				"path.resolve(Paths.get(\"world/Hello.java\"))::\t" + path.resolve(Paths.get("world/Hello.java")));
		System.out.println("path.resolve(\"/world/Hello.java\")::\t" + path.resolve("/world/Hello.java"));

		Path absolutePath = Paths.get("E:/OCPJavaSE7/");
		System.out.println("absolutePath.resolve(path)::\t" + absolutePath.resolve(path));
		// If you pass an absolute path as a parameter, this method returns the
		// absolute path:
		System.out.println("path.resolve(absolutePath)::\t" + path.resolve(absolutePath));

		// RootPathToAbsolutePath:: C:\OCJP\Workspace\OCJP7
		// path.resolve(Paths.get("world/Hello.java"))::
		// \mydir\code\world\Hello.java
		// path.resolve("/world/Hello.java"):: \world\Hello.java
		// absolutePath.resolve(path):: E:\mydir\code
		// path.resolve(absolutePath):: E:\OCPJavaSE7

	}

}
