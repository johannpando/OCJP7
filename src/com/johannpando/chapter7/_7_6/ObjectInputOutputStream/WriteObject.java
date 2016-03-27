package com.johannpando.chapter7._7_6.ObjectInputOutputStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Car implements Serializable {

	public String toString() {
		return "Car Class";
	}
}

public class WriteObject {

	public static void main(String[] args) throws FileNotFoundException,
			IOException {
		try (FileOutputStream fos = new FileOutputStream(
				"c://temp//ocp7//data//object.data");
				ObjectOutputStream oos = new ObjectOutputStream(fos)) {
			// If class Car not implements Serializable, throws
			// java.io.NotSerializableException
			Car c = new Car();
			oos.writeObject(c);
			oos.flush();
		}
	}

}
