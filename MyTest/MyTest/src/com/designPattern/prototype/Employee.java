package com.designPattern.prototype;

public class Employee implements Prototype {

	private int roll;
	private String name;
	private int age;

	public Employee() {

	}

	public Employee(int roll, String name, int age) {
		this.roll = roll;
		this.name = name;
		this.age = age;
	}

	@Override
	public Prototype getClone() {
		return new Employee(this.roll, this.name, this.age);
	}

	@Override
	public String toString() {
		return "Employee [roll=" + roll + ", name=" + name + ", age=" + age + "]";
	}
	
	

}
