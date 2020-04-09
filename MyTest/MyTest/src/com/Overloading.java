package com;

class Parent {
	public int m1() {
		return 1;
	}
}

class Child extends Parent {

	public String m1(int i) {
		return "A"+2;
	}
	
	
}

public class Overloading {

	public static void main(String[] args) {
		// in overloading method resolution always take care by reference type
		// i.e why it is known as compile time polymorphism
		Parent p = new Child();
		System.out.println(p.m1());
	}

}
