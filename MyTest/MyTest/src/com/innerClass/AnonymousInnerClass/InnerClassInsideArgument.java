package com.innerClass.AnonymousInnerClass;

public class InnerClassInsideArgument {

	public static void main(String[] args) {

		new Thread(new Runnable() {
			public void run() {
				System.out.println("child class");
			}
		}).start();
		
		System.out.println("Main thread");

	}

}
