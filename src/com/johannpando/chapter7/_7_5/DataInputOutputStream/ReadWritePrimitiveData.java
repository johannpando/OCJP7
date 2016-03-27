package com.johannpando.chapter7._7_5.DataInputOutputStream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadWritePrimitiveData {

	public static void main(String[] args) throws FileNotFoundException,
			IOException {
		try (FileOutputStream fos = new FileOutputStream(
				"c://temp/ocp7//data//myData.data");
				DataOutputStream dos = new DataOutputStream(fos);
				FileInputStream fis = new FileInputStream(
						"c://temp/ocp7//data//myData.data");
				DataInputStream dis = new DataInputStream(fis);) {
			dos.writeChars("OS");
			dos.writeInt(999);
			dos.writeDouble(45.8);
			dos.writeBoolean(true);
			dos.writeUTF("Will score 100%");

			System.out.println(dis.readChar());
			System.out.println(dis.readChar());
			System.out.println(dis.readInt());
			System.out.println(dis.readDouble());
			System.out.println(dis.readBoolean());
			System.out.println(dis.readUTF());
			// If uncommented this line throws EOFException at runtime.
			// System.out.println(dis.readBoolean());
		}
	}

}
