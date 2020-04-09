package com.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Human implements Serializable {
	String name = "Abhishek";
	transient String password = "abhishek";
	transient int pin = 1234;

	private void writeObject(ObjectOutputStream oos) throws IOException {

		oos.defaultWriteObject();
		String epwd = password + "abc";
		int epin = pin + 4444;
		oos.writeObject(epwd);
		oos.writeInt(epin);
	}

	private void readObject(ObjectInputStream ois) throws IOException, ClassNotFoundException {
		ois.defaultReadObject();
		String epwd = (String) ois.readObject();
		this.password = epwd.substring(0, 8);
		this.pin = ois.readInt() - 4444;

	}

}

public class CustomSeralization {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		Human human = new Human();

		FileOutputStream fos = new FileOutputStream("C:/Users/M1039239/Desktop/serializationDemo/abc0401.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(human);

		FileInputStream fis = new FileInputStream("C:/Users/M1039239/Desktop/serializationDemo/abc0401.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Human h = (Human) ois.readObject();
		System.out.println(h.name + ":" + h.password + ":" + h.pin);
	}

}
