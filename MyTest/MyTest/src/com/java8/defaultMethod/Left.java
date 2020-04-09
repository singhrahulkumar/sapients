package com.java8.defaultMethod;

public interface Left {
	default void m1() {
		System.out.println("Left interface");
	}
}
