package com.johannpando.chapter7._7_3.BufferedInputOutputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class NonBufferedBytesReadWrite {

	public static void main(String[] args) throws FileNotFoundException,
			IOException {
		try (FileInputStream fis = new FileInputStream(
				"c:\\temp\\ocp7\\data\\sample4.pdf");
				FileOutputStream fos = new FileOutputStream(
						"c:\\temp\\ocp7\\data\\sample5.pdf")) {
			long start = System.currentTimeMillis();
			// Declares variable to store a single byte of data
			int data;
			// Loops until end of stream is reached.
			while ((data = fis.read()) != -1) {
				// Writes byte data to destination file.
				fos.write(data);
			}
			long end = System.currentTimeMillis();
			System.out.println("Milliseconds elapsed: " + (end - start));
			// Milliseconds elapsed: 38230
		}
	}

}
