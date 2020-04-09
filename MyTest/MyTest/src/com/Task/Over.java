package com.Task;


class A{
	public void m1() {
		System.out.println("A");
	}
}


class B extends A{
	/*public void m1() {
		System.out.println("B");
	}*/
}

public class Over {

	public static void main(String[] args) {
		A a = new B();
		a.m1();
	}

}
