package com.String;

public class ImmutableClass {

	public static void main(String[] args) {
		TestImmutable t1 = new TestImmutable(10);
		TestImmutable t2 = t1.modify(100);
		System.out.println(t2 == t1);
		TestImmutable t3 = t1.modify(10);
		System.out.println(t3 == t1);
	}
}
