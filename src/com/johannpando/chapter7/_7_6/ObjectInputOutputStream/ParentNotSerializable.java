package com.johannpando.chapter7._7_6.ObjectInputOutputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Vehicle {
	String name = "Vehicle";
}

class Car1 extends Vehicle implements Serializable {
	String model = "Luxury";
}

public class ParentNotSerializable {

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
			Car1 c = new Car1();
			oos.writeObject(c);
			oos.flush();

			// readObject might throws ClassNotFoundException
			Car1 c2 = (Car1) ois.readObject();
			System.out.println(c2.name + ":" + c2.model);
		}
	}
}
