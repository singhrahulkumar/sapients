package com.innerClass.RegualarInnerClass;

public class RegularInnerClass {

	class Inner {
		public void m1() {
			System.out.println("Inner class");
		}
	}

	public static void main(String[] args) {
		RegularInnerClass outer = new RegularInnerClass();
		RegularInnerClass.Inner inner = outer.new Inner();
		inner.m1();
		new RegularInnerClass().new Inner().m1();

		// accessing from instance area of outer class

		RegularInnerClass o2 = new RegularInnerClass();
		o2.m2();

	}

	private void m2() {
		Inner i = new Inner();
		System.out.println("From instance area of outer clas");
		i.m1();
	}

}
