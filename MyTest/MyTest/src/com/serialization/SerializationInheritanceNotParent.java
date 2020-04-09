package com.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Animal1 {
	int a = 10;

	Animal1() {
		System.out.println("Animal constructor");
	}
}

class Doggy1 extends Animal1 implements Serializable {
	int d = 20;

	Doggy1() {
		System.out.println("Dog constructor");
	}
}

public class SerializationInheritanceNotParent {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Doggy1 d = new Doggy1();
		d.a = 999;
		d.d = 888;
		FileOutputStream fos = new FileOutputStream(
				"C:\\eclilpseCodespace\\codespacePractise\\MyTest\\MyTest\\demoFile\\customSer.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(d);

		FileInputStream fileInputStream = new FileInputStream(
				"C:\\eclilpseCodespace\\codespacePractise\\MyTest\\MyTest\\demoFile\\customSer.ser");
		ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
		Doggy1 d1 = (Doggy1) objectInputStream.readObject();
		System.out.println(d1.a + ":" + d1.d);

	}

}
