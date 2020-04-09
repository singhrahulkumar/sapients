package com.designPattern.singleton;

public class SingeltonDriver {

	public static void main(String[] args) {

		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		System.out.println(s1 == s2);

		SafeSingleton singleton = SafeSingleton.getInstance();
	}

}
