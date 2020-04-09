package com.inheritance;

class Parent{
	
	public void m1(Object o) {
		System.out.println("Object --"+ o);
	}
	
	public void m1(String s) {
		System.out.println("String -- "+s);
	}
}

public class ChildPriority {

	public static void main(String[] args) {
		
		Parent p = new Parent();
		p.m1("Abc");
		p.m1(Integer.valueOf(10));
		p.m1(null);//
		
	}

}
