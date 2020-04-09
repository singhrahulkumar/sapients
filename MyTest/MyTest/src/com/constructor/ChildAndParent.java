package com.constructor;

class Parent1{
	Parent1(){
		System.out.println("parent");
	}
	

}

class Child1 extends Parent1{
	
	// child constructor always invoke parent class constructor
	Child1(){
		System.out.println("Child");
	}
}

public class ChildAndParent {

	public static void main(String[] args) {
		Child1 c = new Child1();
	}

}
