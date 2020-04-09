package com.java8.lambda;

public class Inter1Driver {

	public static void main(String[] args) {

		InterWithoutLambda inter = () -> System.out.println("Hello World");
		InterWithoutLambda inter1 = () -> System.out.println("hello world2");

		inter.m1();
		inter1.m1();

	}

}
