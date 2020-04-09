package com.thread;

//class level lock
class Display6 {

	public void wish(String name) {
		// ;;; 1 lakhs lines of codes
		synchronized (MyThread6.class) {
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

class MyThread6 extends Thread {

	Display6 d;
	String name;

	public MyThread6(Display6 d, String name) {
		this.d = d;
		this.name = name;
	}

	@Override
	public void run() {
		d.wish(name);
	}
}

public class SynchronizedBlockClassLevelLock {

	public static void main(String[] args) {
		Display6 d = new Display6();
		Display6 d2 = new Display6();
		MyThread6 t = new MyThread6(d, "Dhoni");
		MyThread6 t1 = new MyThread6(d2, "Yuvraj");
		t.start();
		t1.start();
	}

}
