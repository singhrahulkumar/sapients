package com.thread;
// synchronized method example

// when we are not using synchronized keyword in the given method then output 
// will be distorted but when we use synchronized key word they we get sequentially output

//when same object will passed if method is synchronized then at a time only one thread will get the
//chance. Why?
//Because thread need object level lock to access that object
class Display1 {

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

class MyThread2 extends Thread {
	String name;
	Display1 d;

	public MyThread2(Display1 d, String name) {
		this.name = name;
		this.d = d;
	}

	public void run() {
		d.wish(name);
	}
}

public class SynchronizedMethod {

	public static void main(String[] args) {
		Display1 d = new Display1();
		MyThread2 t = new MyThread2(d, "Dhoni");
		MyThread2 t2 = new MyThread2(d, "Yuvraj");
		t.start();
		t2.start();
	}

}
