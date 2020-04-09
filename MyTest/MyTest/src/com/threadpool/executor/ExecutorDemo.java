package com.threadpool.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class PrintJob implements Runnable {

	String name;

	PrintJob(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		System.out.println(name + " job started by " + Thread.currentThread().getName());
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
		}
		System.out.println(name + " job end by " + Thread.currentThread().getName());
	}
}

public class ExecutorDemo {

	public static void main(String[] args) {
		PrintJob[] printJob = { 
				new PrintJob("Abhishek"), 
				new PrintJob("Squirtle"), 
				new PrintJob("Articuno"),
				new PrintJob("charmendar"), 
				new PrintJob("Pidgeot"), 
				new PrintJob("Charizard") 
			};

		ExecutorService service = Executors.newFixedThreadPool(3);
		for (PrintJob job : printJob) {
			service.submit(job);
		}
		service.shutdown();
	}
}
