package com.thread;

// A daemon is execute until the completion the last non daemon thread

public class DaemonThread {

	public static void main(String[] args) {

		Runnable r = () -> {
			for (int i = 0; i < 10; i++) {
				System.out.println("Child thread");
			}
		};

		Thread t = new Thread(r);
		System.out.println(t.isDaemon());
		t.setDaemon(true);
		System.out.println("Is child thread daemon: " + t.isDaemon());
		t.start();
		System.out.println("Main terminated");

	}

}
