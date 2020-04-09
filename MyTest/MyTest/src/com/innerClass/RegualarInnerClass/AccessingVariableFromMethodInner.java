package com.innerClass.RegualarInnerClass;

public class AccessingVariableFromMethodInner {

	int x = 10;
	static int y = 20;

	// if we make the method static then we can access only static variable

	public /* static */ void m1() {
		int z = 30;
		
		class Inner {
			public void print() {
				System.out.println(x);
				System.out.println(y);
				System.out.println(z);
			}
		}
		Inner i = new Inner();
		i.print();

	}

	public static void main(String[] args) {
		new AccessingVariableFromMethodInner().m1();
	}

}
