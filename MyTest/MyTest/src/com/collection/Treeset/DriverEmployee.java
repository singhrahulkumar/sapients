package com.collection.Treeset;

import java.util.Comparator;
import java.util.TreeSet;

public class DriverEmployee {

	public static void main(String[] args) {

		Comparator<Employee> c = (e1, e2) -> e1.getId() > e2.getId() ? -1 : e1.getId() < e1.getId() ? 1 : 0;

		TreeSet<Employee> e = new TreeSet<Employee>(c);
		// TreeSet<Employee> e = new TreeSet<Employee>(new EmployeeCustomSorting());
		e.add(new Employee(2, "Abhishek"));
		e.add(new Employee(1, "Arun"));
		e.add(new Employee(4, "Ashish"));
		e.add(new Employee(1, "Aa"));
		e.add(new Employee(5, "zz"));
		System.out.println(e.toString());
	}

}

class EmployeeCustomSorting implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {

		Employee e1 = (Employee) o1;
		Employee e2 = (Employee) o2;

		if (e1.getId() < e2.getId())
			return +1;
		else if (e1.getId() > e2.getId())
			return -1;
		return -e1.getName().compareTo(e2.getName());
	}

}
