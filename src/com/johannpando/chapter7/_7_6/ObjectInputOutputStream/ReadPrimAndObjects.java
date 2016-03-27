package com.johannpando.chapter7._7_6.ObjectInputOutputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Car3 implements Serializable {
	String name;

	Car3(String value) {
		name = value;
	}
}

public class ReadPrimAndObjects {

	public static void main(String[] args) throws FileNotFoundException,
			IOException, ClassNotFoundException {
		try (FileOutputStream fos = new FileOutputStream(
				"c://temp//ocp7//data//objectCar3.data");
				ObjectOutputStream oos = new ObjectOutputStream(fos);
				FileInputStream fis = new FileInputStream(
						"c://temp//ocp7//data//objectCar3.data");
				ObjectInputStream ois = new ObjectInputStream(fis);) {

			Car3 c3 = new Car3("Toyota");
			oos.writeObject(c3);
			oos.flush();

			// If uncommented this line throws java.io.EOFException
			// System.out.println(ois.readBoolean());
			Car3 c = (Car3) ois.readObject();
			System.out.println(c.name);
		}
	}
}
