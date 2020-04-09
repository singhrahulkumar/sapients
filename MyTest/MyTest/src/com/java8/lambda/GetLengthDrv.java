package com.java8.lambda;

public class GetLengthDrv {

	public static void main(String[] args) {

		GetLength g = s -> {
			return s.length();
		};

		// if only one line is there then there is no need of return statement
		GetLength g1 = s -> s.length();

		int l = g.getLength("Abhishek");
		System.out.println(l);

		System.out.println(g.getLength("Abhishek Prasad"));
	}

}
