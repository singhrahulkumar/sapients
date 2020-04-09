package com.Generics;

// unbounded type: takes any type as t
class Gen<T> {

	T obj;

	public void show() {
		System.out.println(obj.getClass().getName());
	}

	public T getObj() {
		return obj;
	}

	public void setObj(T t) {
		this.obj = t;
	}

}

public class GenericsDemo {

	public static void main(String[] args) {

		Gen<String> str = new Gen<String>();
		str.setObj("Abhishek");
		System.out.println(str.getObj());
		
		
	}

}
