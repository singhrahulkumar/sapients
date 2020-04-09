package com.java8.defaultMethod;

public interface Right {
	default void m1() {
		System.out.println("Right interface");
	}
}
