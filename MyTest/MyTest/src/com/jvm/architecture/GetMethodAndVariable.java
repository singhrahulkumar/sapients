package com.jvm.architecture;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class GetMethodAndVariable {

	int i = 2;

	public static void main(String[] args) throws ClassNotFoundException {

		GetMethodAndVariable g = new GetMethodAndVariable();
		g.m1();
		Student s = new Student();
		Class c = s.getClass();
		Method[] m = c.getDeclaredMethods();
		Field[] v = c.getDeclaredFields();
		System.out.println("METHODS ");
		for (Method m1 : m) {

			System.out.println(m1);
		}

		System.out.println("FIELDS ");
		for (Field m1 : v) {

			System.out.println(m1);
		}

	}

	public void m1() {
		int i = 3;
		System.out.println(i);
		System.out.println(this.i);
	}

}
