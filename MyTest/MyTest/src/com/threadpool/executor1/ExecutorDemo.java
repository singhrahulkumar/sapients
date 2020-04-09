package com.threadpool.executor1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class PrintJob implements Runnable {

	String name;

	PrintJob(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		System.out.println(name + " Thread executed by " + Thread.currentThread().getName());
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(name + " Thread end by " + Thread.currentThread().getName());
	}
}

public class ExecutorDemo {
	public static void main(String[] args) {
		PrintJob[] job = { new PrintJob("AAA"), new PrintJob("BBB"), new PrintJob("CCC"), new PrintJob("DDD"),
				new PrintJob("EEE"), new PrintJob("FFF"), };
		ExecutorService service = Executors.newFixedThreadPool(6);
		for (PrintJob printJob : job) {
			service.submit(printJob);
		}
		service.shutdown();
	}
}













