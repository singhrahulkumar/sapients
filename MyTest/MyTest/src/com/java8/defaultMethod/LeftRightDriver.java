package com.java8.defaultMethod;

public class LeftRightDriver implements Left, Right {

	public void m1() {
		 Left.super.m1();
	}

	public static void main(String[] args) {

		Left l = new LeftRightDriver();
		l.m1();
	}

}
