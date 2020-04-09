package com.designPattern;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SingletonInnerClassDriverReflection {

	public static void main(String[] args)
			throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {

		SingletonInnerClass instance = SingletonInnerClass.getInstance();
		SingletonInnerClass instance1 = null;

		Constructor[] constructor = SingletonInnerClass.class.getDeclaredConstructors();
		for (Constructor cons : constructor) {
			cons.setAccessible(true);
			instance1 = (SingletonInnerClass) cons.newInstance();
		}

		System.out.println(instance.hashCode());
		System.out.println(instance1.hashCode());

	}

}
