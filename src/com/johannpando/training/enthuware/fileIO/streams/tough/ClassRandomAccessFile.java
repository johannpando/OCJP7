package com.johannpando.training.enthuware.fileIO.streams.tough;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;

public class ClassRandomAccessFile {

	public static void main(String[] args) throws IOException {
		write();
	}

	private static void write() throws IOException {
		String fileName1 = "/Users/Johann/git/OCJP7/source/RandomAccessFile.txt";
		RandomAccessFile raf = new RandomAccessFile(fileName1, "rwd");
		raf.writeUTF("Hello World");
		raf.close();

		DataInputStream dis = new DataInputStream(new FileInputStream(fileName1));
		String value = dis.readUTF();
		System.out.println(value);
		dis.close();
	}

}
