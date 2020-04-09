package com.java8.lambda;

public class AnonymousMethodInnerWithLambda {
	int x = 888;

	public static void main(String[] args) {

		AnonymousMethodInnerWithLambda a = new AnonymousMethodInnerWithLambda();
		a.m2();

	}

	public void m2() {

		Inter2 i = () -> {

			int x = 999;
			System.out.println(this.x);

		};
		new Inter2() {
			int x = 999;

			public void m1() {
				System.out.println("Inside m1 inner class :" + this.x);
				System.out.println("Calling outer class :" + AnonymousMethodInnerWithLambda.this.x);
			}
		};

		i.m1();
	}
}

interface Inter2 {
	public void m1();
}
