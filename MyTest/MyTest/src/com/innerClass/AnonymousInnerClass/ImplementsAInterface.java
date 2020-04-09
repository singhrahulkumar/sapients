package com.innerClass.AnonymousInnerClass;

public class ImplementsAInterface {

	public static void main(String[] args) {

		Runnable r = new Runnable() {
			public void run() {
				for (int i = 0; i < 10; i++) {
					System.out.println("Child");
				}
			}
		};
		Thread t = new Thread(r);
		t.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("Main");
		}

	}

}
