package com.inheritance;

class A {
	public void m1() {
		System.out.println("Inside A");
	}
}

class B extends A {
	public void m1() {
		System.out.println("Inside B");
	}

	public void m2() {
		System.out.println("Inside B m2");
	}
}

public class Test {

	public static void main(String[] args) {

		A a = new B();
		a.m1();
	}

}
