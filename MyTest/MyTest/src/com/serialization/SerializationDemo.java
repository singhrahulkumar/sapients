package com.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Dog implements Serializable {
	int i = 10;
	// if we use transient keyword then jvm ignore the field value
	// and it replace with default value

	// if we use static : as static is not part of object so they
	// don't involve in serialization
	
	// if we use final : as in compile time only jvm replace the final 
	// variable with their values so it wont affect its value
	/*final*/  /*static*/  transient  int j = 20;

}

public class SerializationDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		Dog d = new Dog();

		FileOutputStream fos = new FileOutputStream("C:/Users/M1039239/Desktop/serializationDemo/abc.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(d);

		FileInputStream fis = new FileInputStream("C:/Users/M1039239/Desktop/serializationDemo/abc.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Dog d1 = (Dog) ois.readObject();
		System.out.println(d1.i + "..." + d1.j);
	}
}
