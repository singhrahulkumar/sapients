package com.Autoboxing;

public class AutoboxingDemo {

	public static void main(String[] args) {

		Integer nine = new Integer(9);
		Integer nine1 = new Integer(9);

		System.out.println(nine == nine1);

		Integer n = Integer.valueOf(9);
		Integer n1 = Integer.valueOf(9);

		System.out.println(n == n1);

	}

}
