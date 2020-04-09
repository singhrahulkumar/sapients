package com.threadlocal;

public class ThreadLocalDemo {

	public static void main(String[] args) {

		// overriding of initial value method
		// if this method is not overridden then we will get null
		ThreadLocal tl = new ThreadLocal() {
			public Object initialValue() {
				return "abc";
			}
		};
		System.out.println(tl.get());
		tl.set("abhishek");
		System.out.println(tl.get());
		tl.remove();
		System.out.println(tl.get());

	}

}
