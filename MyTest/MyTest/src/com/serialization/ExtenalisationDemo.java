package com.serialization;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class ExtenalisationDemo implements Externalizable {

	public String s;
	public Integer i;
	public Integer j = 10;

	public ExtenalisationDemo() {
		System.out.println("No argument constructor called");
	}

	public ExtenalisationDemo(String s, Integer i, Integer j) {
		this.s = s;
		this.i = i;
		this.j = j;
	}

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		ExtenalisationDemo ed = new ExtenalisationDemo("abhi", 1, 2);
		FileOutputStream fileOutputStream = new FileOutputStream(
				"C:\\eclilpseCodespace\\codespacePractise\\MyTest\\MyTest\\demoFile\\abc0501.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fileOutputStream);
		oos.writeObject(ed);

		FileInputStream fis = new FileInputStream(
				"C:\\eclilpseCodespace\\codespacePractise\\MyTest\\MyTest\\demoFile\\abc0501.ser");
		ObjectInputStream objectInputStream = new ObjectInputStream(fis);
		ExtenalisationDemo ed1 = (ExtenalisationDemo) objectInputStream.readObject();
		System.out.println(ed1.s + ":" + ed1.i + ":" + ed1.j);

	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeObject(s);
		out.writeObject(i);
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		s = (String) in.readObject();
		i = (Integer) in.readObject();
		System.out.println();
	}

}
