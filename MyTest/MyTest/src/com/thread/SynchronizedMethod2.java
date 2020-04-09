package com.thread;

// synchronized method example

// when we are not using synchronized keyword in the given method then output 
// will be distorted but when we use synchronized key word they we get sequentially output

// when different object will passed if method is synchronized then 
// then also we will get distorted o/p because thread accessing different object

class Display4 {

	public synchronized void wish(String name) {
		for (int i = 0; i < 10; i++) {
			System.out.print("Good Morning :");
			System.out.println(name);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println("Exception");
			}
			
		}
	}
}

class MyThread4 extends Thread {
	String name;
	Display4 d;

	public MyThread4(Display4 d, String name) {
		this.name = name;
		this.d = d;
	}

	public void run() {
		d.wish(name);
	}
}

public class SynchronizedMethod2 {

	public static void main(String[] args) {
		Display4 d = new Display4();
		Display4 d2 = new Display4();
		MyThread4 t = new MyThread4(d, "Dhoni");
		MyThread4 t2 = new MyThread4(d2, "Yuvraj");
		t.start();
		t2.start();
	}

}
