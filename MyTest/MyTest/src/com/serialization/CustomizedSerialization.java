package com.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Account implements Serializable {

	String userName = "Abhishek";
	transient String password = "password";
	transient int pin = 1234;

	private void writeObject(ObjectOutputStream oos) throws IOException {
		oos.defaultWriteObject();
		String epwd = "123" + password;
		int epin = 4444 + pin;
		oos.writeObject(epwd);
		oos.writeInt(epin);

	}

	private void readObject(ObjectInputStream ois) throws ClassNotFoundException, IOException {
		ois.defaultReadObject();
		String epwd = (String) ois.readObject();
		password = epwd.substring(3);
		int epin = ois.readInt();
		pin = epin - 4444;
	}
}

public class CustomizedSerialization {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		Account s = new Account();
		System.out.println(s.userName + "...." + s.password + "..." + s.pin);
		FileOutputStream fos = new FileOutputStream("C:/Users/M1039239/Desktop/serializationDemo/customSer.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(s);

		FileInputStream fis = new FileInputStream("C:/Users/M1039239/Desktop/serializationDemo/customSer.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Account s1 = (Account) ois.readObject();
		System.out.println(s1.userName + "..." + s1.password + "..." + s1.pin);
	}

}
