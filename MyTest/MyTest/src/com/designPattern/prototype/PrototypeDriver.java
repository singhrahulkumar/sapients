package com.designPattern.prototype;

public class PrototypeDriver {

	public static void main(String[] args) {

		Employee e1 = new Employee(1, "Abhi", 24);
		Employee e2 = (Employee) e1.getClone();
		System.out.println(e1.toString());
		System.out.println(e2.toString());
		System.out.println(e1==e2);

	}

}
