package com.java8.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortObjectWithLambda {

	public static void main(String[] args) {

		Comparator<Employee> compare = (e1, e2) -> (e1.getId() > e2.getId()) ? -1 : (e1.getId() < e2.getId()) ? 1 : 0;

		ArrayList<Employee> eList = new ArrayList<>();
		eList.add(new Employee(10, "aaa"));
		eList.add(new Employee(0, "bbb"));
		eList.add(new Employee(5, "ccc"));
		eList.add(new Employee(15, "ddd"));
		eList.add(new Employee(7, "eee"));

		Collections.sort(eList, compare);
		System.out.println(eList);

	}

}

class Employee {
	private int id;
	private String name;

	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}

}
