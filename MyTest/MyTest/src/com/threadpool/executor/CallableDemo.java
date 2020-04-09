package com.threadpool.executor;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class MyCallable implements Callable {

	int num;

	public MyCallable(int num) {
		this.num = num;
	}

	@Override
	public Object call() throws Exception {

		System.out.println(Thread.currentThread().getName() + " started sum of " + num);
		int sum = 0;
		for (int i = 1; i <= num; i++) {
			sum = sum + i;
		}
		return sum;
	}

}

public class CallableDemo {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		MyCallable[] callable = { new MyCallable(10), new MyCallable(20), new MyCallable(30), new MyCallable(40),
				new MyCallable(50), };
		ExecutorService service = Executors.newFixedThreadPool(3);
		for (MyCallable myCallable : callable) {
			Future future = service.submit(myCallable);
			System.out.println(future.get());
		}
		service.shutdown();

	}

}
