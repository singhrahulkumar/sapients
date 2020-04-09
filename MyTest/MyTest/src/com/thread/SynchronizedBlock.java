package com.thread;

class Display {

	public void wish(String name) {
		// ;;; 1 lakhs lines of codes
		synchronized (this) {
			for (int i = 0; i < 10; i++) {
				System.out.print("Good morning:");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					System.out.println("Exception");
				}
				System.out.println(name);
				// ;;; 1 lakhs lines of codes
			}
		}

	}

}

class MyThread3 extends Thread {

	Display d;
	String name;

	public MyThread3(Display d, String name) {
		this.d = d;
		this.name = name;
	}

	@Override
	public void run() {
		d.wish(name);
	}
}

public class SynchronizedBlock {

	public static void main(String[] args) {
		Display d = new Display();
		MyThread3 t = new MyThread3(d, "Dhoni");
		MyThread3 t1 = new MyThread3(d, "Yuvraj");
		t.start();
		t1.start();
	}

}
