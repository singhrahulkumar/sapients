package com.Generics;


class MultipleTypeDemo<A, B> {

	A a;
	B b;

	
	public MultipleTypeDemo() {
		// TODO Auto-generated constructor stub
	}
	public MultipleTypeDemo(A a, B b) {
		this.a = a;
		this.b = b;
	}

	public void show() {
		System.out.println("A type-->" + a.getClass().getName());
		System.out.println("B type-->" + b.getClass().getName());
	}

	public A getA() {
		return this.a;
	}

	public B getB() {
		return this.b;
	}

	public void setA(A a) {
		this.a = a;
	}

	public void setB(B b) {
		this.b = b;
	}

}

public class MultipleType {

	public static void main(String[] args) {
		
		MultipleTypeDemo<Integer,String> demo = new MultipleTypeDemo<>();
		demo.setA(10);
		demo.setB("Abhishek");
		
		System.out.println(demo.getA()+"  "+demo.getB());
		demo.show();
		
	}

}
