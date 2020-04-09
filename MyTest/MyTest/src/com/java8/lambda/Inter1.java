package com.java8.lambda;

@FunctionalInterface
public interface Inter1 {

	public void m1();
	

	default void m2() {
		System.out.println("Inter1 default");
	}

	public static void m3() {
		System.out.println("Inter1 static");
	}

}
