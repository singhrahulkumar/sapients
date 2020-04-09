package com.methodReference;

interface Refer {
	public void m1();
}

public class Test {

	public static void m2() {
		System.out.println("Calling m2 method");
	}

	public static void main(String[] args) {
		
		Refer r = Test::m2;
		r.m1();
	}

}
