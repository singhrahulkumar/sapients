package com.test;

class Animal {
	public void m1(Monkey m) {
		System.out.println("bhag yaga se");
	}
}

class Monkey extends Animal {
	public void m1(Monkey m) {
		System.out.println("Monkey child");
	}
}

class MyTest {
	public void m1(Animal a) {
		System.out.println("Animal");
	}

	public void m1(Monkey m) {
		System.out.println("Monkey");
	}
}
 
public  class Test {

	public static void main(String[] args) {
		MyTest t = new MyTest();

		Animal a = new Animal();
		t.m1(a);//

		Monkey m = new Monkey();
		t.m1(m);
		
		m.m1(m);// overriding
		
		Animal a1 = new Monkey();
		t.m1(a1);

	

	}
}
