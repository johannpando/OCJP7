package com.johannpando.chapter7._7_6.ObjectInputOutputStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Engine {
	String make = "198768";
}

class Car2 implements Serializable {
	String model = "Luxury";
	Engine engine = new Engine();
}

public class DataMemberNotSerializable {

	public static void main(String[] args) throws FileNotFoundException,
			IOException, ClassNotFoundException {
		try (FileOutputStream fos = new FileOutputStream(
				"c://temp//ocp7//data//object.data");
				ObjectOutputStream oos = new ObjectOutputStream(fos);) {
			// Data member engine, is not serializable. Throws
			// java.io.NotSerializableException
			Car2 c = new Car2();
			oos.writeObject(c);
			oos.flush();
		}
	}
}
