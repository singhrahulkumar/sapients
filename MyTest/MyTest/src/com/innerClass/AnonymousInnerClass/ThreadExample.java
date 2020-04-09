package com.innerClass.AnonymousInnerClass;

public class ThreadExample {

	public static void main(String[] args) {

		Thread t = new Thread() {
			@Override
			public void run() {
				
				for (int i = 0; i < 10; i++) {
					System.out.println("Child");
				}
			}
		};
		t.setPriority(10);
		t.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("Main");
		}
	}

}
