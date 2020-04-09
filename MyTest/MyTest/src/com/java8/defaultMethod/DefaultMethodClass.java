package com.java8.defaultMethod;

public class DefaultMethodClass implements DefaultMethod {

/*	@Override
	public void m1() {
		System.out.println("Default method class ");
	}*/

	public static void main(String[] args) {

		DefaultMethod d = new DefaultMethodClass();
		d.m1();

	}

}
