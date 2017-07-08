package com.johannpando.chapter7._7_2.FileInputOutputStream;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InvalidClassException;

public class ReadWriteBytesUsingFileOptimized {

	public static void main(String[] args) throws IOException {
		try (FileInputStream fis = new FileInputStream("c:\\temp\\ocp7\\data\\sample3.pdf");
				FileOutputStream fos = new FileOutputStream("c:\\temp\\ocp7\\data\\sample4.pdf")) {
			// Declares variable to store a single byte of data
			int data;
			// Creates byte array of size 1024
			byte[] byteArray = new byte[1024];
			// Loops until end of stream is reached.
			while ((data = fis.read(byteArray)) != -1) {
				// Writes only read bytes to output stream
				fos.write(byteArray, 0, data);
			}
		} catch (FileNotFoundException | InvalidClassException | EOFException e) {
			// TODO: handle exception
		}
	}
}
