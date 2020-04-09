package com.designPattern.singleton;

public class SafeSingleton {

	private SafeSingleton() {

	}

	private static class SingletonHolder {
		public static final SafeSingleton instance = new SafeSingleton();
	}

	public static SafeSingleton getInstance() {
		return SingletonHolder.instance;
	}

}
