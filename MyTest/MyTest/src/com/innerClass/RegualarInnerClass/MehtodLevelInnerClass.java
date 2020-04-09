package com.innerClass.RegualarInnerClass;

class TestOuter {

	public void m1() {

		class Inner {
			public int sum(int a, int b) {
			
				return a + b;
			}
		}

		Inner i = new Inner();
		int s = i.sum(1, 2);
		System.out.println(s);
	}
}

public class MehtodLevelInnerClass {

	public static void main(String[] args) {
		new TestOuter().m1();

	}

}
