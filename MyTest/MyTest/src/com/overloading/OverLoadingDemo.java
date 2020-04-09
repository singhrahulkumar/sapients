package com.overloading;

public class OverLoadingDemo {

	public void m1(String s) {
		System.out.println(s + " String m1");
	}

	public void m1(StringBuffer sb) {
		System.out.println(sb + " SB m1");
	}

	public static void main(String[] args) {

		OverLoadingDemo t = new OverLoadingDemo();
		t.m1("A");
		t.m1(new StringBuffer("Abc"));
		// t.m1(null);

	}

}
