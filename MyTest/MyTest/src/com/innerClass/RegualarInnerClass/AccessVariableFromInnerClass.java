package com.innerClass.RegualarInnerClass;

public class AccessVariableFromInnerClass {

	static int x = 10;
	int y = 20;

	class Inner {
		int y = 40;

		public void m1() {
			System.out.println(x);
			System.out.println(AccessVariableFromInnerClass.this.y);
			System.out.println(this.y);
		}
	}

	public static void main(String[] args) {
		new AccessVariableFromInnerClass().new Inner().m1();
	}

}
