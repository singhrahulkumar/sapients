package com.prepare;

class Display {
	public  synchronized void wish(String name) {
		for (int i = 0; i < 10; i++) {
			System.out.print("Hello: ");
			System.out.println(name);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}

		}

	}
}

class MyThread extends Thread {

	public String name;
	public Display d;

	MyThread(Display d, String name) {
		this.name = name;
		this.d = d;
	}

	@Override
	public void run() {
		d.wish(name);
	}
}

public class SynchronisedDemo {

	public static void main(String[] args) {
		Display d = new Display();
		Display d2 = new Display();
		MyThread t = new MyThread(d, "Abhishek");
		MyThread t2 = new MyThread(d2, "Arun");
		t.start();
		t2.start();

	}

}
