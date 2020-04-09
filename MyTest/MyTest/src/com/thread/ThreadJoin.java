package com.thread;

class MyThread5 extends Thread{
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Sita thread");
			try {
			Thread.sleep(100);
			}catch(InterruptedException e) {
				System.out.println();
			}
			
		}
	}
}

public class ThreadJoin {

	public static void main(String[] args) {
		
		MyThread5 t = new MyThread5();
		t.start();
		try {
		t.join();
		}catch(InterruptedException e) {
			System.out.println("Exception");
		}
		for(int i =0;i<10;i++) {
			System.out.println("Rama thread");
		}
	}

}
