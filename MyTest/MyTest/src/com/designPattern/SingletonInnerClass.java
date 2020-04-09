package com.designPattern;

public class SingletonInnerClass {

	private SingletonInnerClass() {

	}

	public static class SingletonHolder {
		private static final SingletonInnerClass INSTANCE = new SingletonInnerClass();
	}

	public static SingletonInnerClass getInstance() {
		return SingletonHolder.INSTANCE;
	}

}
