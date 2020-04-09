package com.staticControlFlow;

public class StaticControlFlow {

	static int x = 10;

	static {
		m1();
		System.out.println("FSB");
	}

	public static void main(String[] args) {
		m1();
		System.out.println("Main method");
	}

	public static void m1() {
		System.out.println(y);
	}

	static {
		System.out.println("SSB");
	}
	static int y = 20;

}
