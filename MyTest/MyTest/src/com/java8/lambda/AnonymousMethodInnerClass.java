package com.java8.lambda;

public class AnonymousMethodInnerClass {
	int x = 888;

	public static void main(String[] args) {

		AnonymousMethodInnerClass a = new AnonymousMethodInnerClass();
		a.m2();

	}

	public void m2() {

		Inter i = new Inter() {
			int x = 999;
			public void m1() {
				System.out.println("Inside m1 inner class :" + this.x);
				System.out.println("Calling outer class :" + AnonymousMethodInnerClass.this.x);
			}
		};
		i.m1();

	}

}

interface Inter {
	public void m1();
}
