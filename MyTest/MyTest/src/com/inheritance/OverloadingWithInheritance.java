package com.inheritance;


class Animal{

}
class Monkey extends Animal{
	
}
public class OverloadingWithInheritance {

	public void m1(Animal a) {
		System.out.println("Animal reference method");
	}
	
	public void m1(Monkey m)
	{
		System.out.println("Monkey reference method");
	}
	
	public static void main(String[] args) {

		OverloadingWithInheritance t = new OverloadingWithInheritance();
		Animal a = new Animal();
		t.m1(a);
		
		Monkey m = new Monkey();
		t.m1(m);
		
		Animal a1 = new Monkey();
		t.m1(a1);
		
		
	}

}
