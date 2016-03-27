package com.johannpando.chapter7._7_6.ObjectInputOutputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ReadWriteObject {
	public static void main(String[] args) throws FileNotFoundException,
			IOException, ClassNotFoundException {
		try (FileOutputStream fos = new FileOutputStream(
				"c://temp//ocp7//data//object.data");
				ObjectOutputStream oos = new ObjectOutputStream(fos);
				FileInputStream fis = new FileInputStream(
						"c://temp//ocp7//data//object.data");
				ObjectInputStream ois = new ObjectInputStream(fis)) {
			// If class Car not implements Serializable, throws
			// java.io.NotSerializableException
			Car c = new Car();
			oos.writeObject(c);
			oos.flush();

			// readObject might throws ClassNotFoundException
			Car c2 = (Car) ois.readObject();
			System.out.println(c2);
		}
	}
}
