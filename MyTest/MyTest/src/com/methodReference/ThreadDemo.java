package com.methodReference;

public class ThreadDemo {

	public void m1() {
		for (int i = 0; i < 10; i++)
			System.out.println("Child thread");
	}

	public static void main(String[] args) {

		ThreadDemo t = new ThreadDemo();
		Runnable r = t::m1;
		Thread th = new Thread(r);
		th.start();
		for (int i = 0; i < 10; i++)
			System.out.println("Main thread");
	}

}
