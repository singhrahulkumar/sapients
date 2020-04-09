package com.constructor;


class Parent {

	int x = 100;

	Parent() {
		this(10);
		System.out.println("Parent Constructor");
	}

	Parent(int x) {
	//	this.x = x;
		System.out.println("Parent args Constructor" + x);
	}

}

public class Child extends Parent {

	static int x = 200;

	Child()  {
		System.out.println("no arg child constructor");
	}

	Child(int i) {
		this();
		this.x = i;
		System.out.println("Child constructor " + i);
	}

	public static void main(String[] args)  {

		Child c = new Child(1);
		c.m1();
		System.out.println(x);

	}

	public void m1() {
		System.out.println(this.x);
		System.out.println(super.x);
	}

}
