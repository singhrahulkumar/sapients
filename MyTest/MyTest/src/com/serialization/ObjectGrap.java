package com.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Dog1 implements Serializable {
	/**
	 * 
	 */
	Cat c = new Cat();

}

class Cat/* implements Serializable*/ {
	Rat r = new Rat();
}

class Rat implements Serializable {
	int i = 20;
}

public class ObjectGrap {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Dog1 d = new Dog1();
		FileOutputStream fos = new FileOutputStream(
				"C:\\eclilpseCodespace\\codespacePractise\\MyTest\\MyTest\\demoFile\\abc0303.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(d);

		FileInputStream fis = new FileInputStream(
				"C:\\eclilpseCodespace\\codespacePractise\\MyTest\\MyTest\\demoFile\\abc0303.txt");
		ObjectInputStream objectInputStream = new ObjectInputStream(fis);
		Dog1 d1 = (Dog1) objectInputStream.readObject();
		System.out.println(d1.c.r.i);
	}

}
