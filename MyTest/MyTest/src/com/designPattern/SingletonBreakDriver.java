package com.designPattern;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SingletonBreakDriver {

	public static void main(String[] args)
			throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException,
			FileNotFoundException, IOException, ClassNotFoundException {

		// singleton break with reflection
		SingletonBreak instance = SingletonBreak.getInstance();
		SingletonBreak instance1 = null;

		Constructor[] constructor = SingletonBreak.class.getDeclaredConstructors();
		for (Constructor cons : constructor) {
			cons.setAccessible(true);
			instance1 = (SingletonBreak) cons.newInstance();
		}

		System.out.println(instance.hashCode());
		System.out.println(instance1.hashCode());

		// to overcome reflection issue
		/*
		 * SingletonReflectionEnum singletonEnum = SingletonReflectionEnum.INSTANCE;
		 * SingletonReflectionEnum singletonEnum1 = null;
		 * 
		 * Constructor[] constructor1 =
		 * SingletonReflectionEnum.class.getDeclaredConstructors(); for (Constructor
		 * cons : constructor1) { cons.setAccessible(true); singletonEnum1 =
		 * (SingletonReflectionEnum) cons.newInstance(); }
		 * 
		 * System.out.println(instance.hashCode());
		 * System.out.println(instance1.hashCode());
		 */

		// singleton break using serialization

		SingletonBreak instance2 = SingletonBreak.getInstance();
		SingletonBreak instance3 = null;

		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(
				"C:\\eclilpseCodespace\\codespacePractise\\MyTest\\MyTest\\demoFile\\abc1502.txt"));
		oos.writeObject(instance2);
		oos.close();

		ObjectInputStream ois = new ObjectInputStream(
				new FileInputStream("C:\\eclilpseCodespace\\codespacePractise\\MyTest\\MyTest\\demoFile\\abc1502.txt"));

		instance3 = (SingletonBreak) ois.readObject();

		System.out.println(instance2.hashCode());
		System.out.println(instance3.hashCode());

		// singleton break resolution for serialization

	}

}
