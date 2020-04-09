package com.designPattern;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class SingletonWithMultiThreaded {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		Callable<SingletonBreak> c = () -> {
			return SingletonBreak.getInstance();
		};
		SingletonBreak singleton = SingletonBreak.getInstance();
		ExecutorService executor = Executors.newFixedThreadPool(1);
		Future f = executor.submit(c);
		SingletonBreak  singleton2 = (SingletonBreak) f.get();
		System.out.println(singleton2 == singleton);

	}

}
