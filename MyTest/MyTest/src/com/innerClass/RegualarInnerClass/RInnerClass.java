package com.innerClass.RegualarInnerClass;

class Test {
	class Inner {
		public void m1() {
			System.out.println("Inner class");
		}
	}
}

public class RInnerClass {

	public static void main(String[] args) {
		Test.Inner t = new Test().new Inner();
		t.m1();
	}

}
