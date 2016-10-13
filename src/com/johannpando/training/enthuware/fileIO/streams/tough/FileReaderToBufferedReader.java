package com.johannpando.training.enthuware.fileIO.streams.tough;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderToBufferedReader {

	public static void main(String[] args) throws Exception {

		String fileName1 = "/Users/Johann/git/OCJP7/source/myCsv.csv";
		charReader(fileName1);
		// En vez de imprimir los char, se imprime en String
		// Por alguna razón no imprime el primer caracter.
		stringReader(fileName1);

	}

	private static void charReader(String fileName1) throws FileNotFoundException, IOException {
		try (FileReader fr = new FileReader(fileName1)) {
			int charRead = 0;
			while ((charRead = fr.read()) != -1) {
				System.out.println("Read char: " + charRead);
			}
		}
	}

	private static void stringReader(String fileName1) throws FileNotFoundException, IOException {
		try (FileReader fr = new FileReader(fileName1); BufferedReader br = new BufferedReader(fr);) {
			// int charRead = 0;
			// while ((charRead = fr.read()) != -1) {
			while (fr.read() != -1) {
				System.out.println("Read string: " + br.readLine());
			}
		}
	}

}
