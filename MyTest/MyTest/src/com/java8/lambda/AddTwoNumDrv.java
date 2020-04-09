package com.java8.lambda;

public class AddTwoNumDrv {

	public static void main(String[] args) {

		AddTwoNumber i = (a, b) -> System.out.println("sum of two number: "+(a + b));
		
		AddTwoNumber add = (a,b) -> System.out.println("sum of two number :"+(a+b));

		i.add(2, 3);
		i.add(100, 200);
		add.add(5, 4);
	}

}
