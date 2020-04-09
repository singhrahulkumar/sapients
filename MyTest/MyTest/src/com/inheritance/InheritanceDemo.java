package com.inheritance;

class P {
	public void m1() {
		System.out.println("P-->m1");
	}
}

class C extends P {
	public void m2() {
		System.out.println("C-->m2");
	}
	
	public void m3() {
		System.out.println("C-->m3");
	}
}

public class InheritanceDemo {

	public static void main(String[] args) {

		// from parent reference we can call only parent method
		P p = new P();
		p.m1();

		// can call both 
		C c = new C();
		c.m1();
		c.m2();

		P p1 = new C();
		p1.m1();
		
		

		// child reference cannot hold parent reference
		// C c1 = new P();

	}

}
