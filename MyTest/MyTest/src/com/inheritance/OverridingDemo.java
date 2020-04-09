package com.inheritance;

class A1 {
	
	int x = 888;
	
	public void m1() {
		System.out.println("m1--a1");
	}

	public static void m2() {
		System.out.println("a1 static method m2");
	}

	public void m3() {
		System.out.println("a1 non static method m3");
	}
	
	public static void m4() {
		System.out.println("a1 static method m4");
	}
}

class C1 extends A1 {
	
	int x = 999;
	// cannot reduce the visibility
	/*
	 * protected void m1() { System.out.println("m1--c1"); }
	 */

	// we cant override static method
	/*
	 * public void m2() { System.out.println("c1 non static method m2"); }
	 */

	// we cannt override non static method as static method
	/*
	 * public static void m3() { System.out.println("c1 static method"); }
	 */
	
	// when we override static method 
	// then it is not overriding, it is method hiding
	public static void m4() {
		System.out.println("c1 static method m4");
	}
}

public class OverridingDemo {

	public static void main(String[] args) {
		A1 a = new A1();
		a.m4();
		
		C1 c = new C1();
		c.m4();
		
		// in method hiding method resolution is done in compile time
		// thats why method hiding is known as early binding and compile time polymorphism
		A1 a1 = new C1();
		a1.m4();
		
		C1 c1 = (C1) new A1();
		System.out.println(c1.x);
		
		// overriding in case of variable always takes place as compile time
		// variable resolution is always takes place as compile time not run time 
		System.out.println(a.x);
		System.out.println(c.x);
		System.out.println(a1.x);
		
	}

}
