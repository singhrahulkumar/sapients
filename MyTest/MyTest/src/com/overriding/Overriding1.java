package com.overriding;

class Parent {
	public Object m1() {
		return 1;
	}
}

class Child extends Parent {

	public String m1() {
		return "";
	}
}

public class Overriding1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
