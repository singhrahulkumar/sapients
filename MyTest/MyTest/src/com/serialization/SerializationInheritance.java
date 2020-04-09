package com.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Animal implements Serializable {
	int a = 10;

}

class Doggy extends Animal {
	int d = 20;
}

public class SerializationInheritance {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Doggy d = new Doggy();
		FileOutputStream fos = new FileOutputStream("C:/Users/M1039239/Desktop/serializationDemo/customSer.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(d);

		FileInputStream fileInputStream = new FileInputStream(
				"C:/Users/M1039239/Desktop/serializationDemo/customSer.ser");
		ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
		Doggy d1 = (Doggy) objectInputStream.readObject();
		System.out.println(d1.a + ":" + d1.d);

	}

}
