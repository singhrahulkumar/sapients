package com.designPattern;

public class SingletonDemo {

	private static SingletonDemo singleton;
	
	private SingletonDemo() {
		
	}
	
	private static SingletonDemo getSingletonDemo() {
		if(singleton == null) {
			singleton = new SingletonDemo();
		}
		return singleton;
	}
}
