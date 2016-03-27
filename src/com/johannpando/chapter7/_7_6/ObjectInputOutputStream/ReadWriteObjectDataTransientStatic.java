package com.johannpando.chapter7._7_6.ObjectInputOutputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Car4 implements Serializable {
	String name;
	transient String model;
	transient int days;
	static int carCount;

	Car4(String value) {
		name = value;
		model = "some value";
		days = 98;
		++carCount;
	}
}

public class ReadWriteObjectDataTransientStatic {

	public static void main(String[] args) throws FileNotFoundException,
			IOException, ClassNotFoundException {
		try (FileOutputStream fos = new FileOutputStream(
				"c://temp//ocp7//data//objectCar4.data");
				ObjectOutputStream oos = new ObjectOutputStream(fos);
				FileInputStream fis = new FileInputStream(
						"c://temp//ocp7//data//objectCar4.data");
				ObjectInputStream ois = new ObjectInputStream(fis);) {

			Car4 c1 = new Car4("AAA");
			oos.writeObject(c1);
			oos.flush();

			new Car4("BBB");

			Car4 c = (Car4) ois.readObject();
			System.out.println("name: " + c.name);
			System.out.println("model: " + c.model);
			System.out.println("days: " + c.days);
			System.out.println("days: " + c.carCount);
		}
	}
}
