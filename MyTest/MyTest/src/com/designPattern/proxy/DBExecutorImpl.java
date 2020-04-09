package com.designPattern.proxy;

public class DBExecutorImpl implements DBExecutor {

	@Override
	public void extecuteDB(String query) {
		System.out.println("Execute DB: " + query);
	}

}
