package com.predicates.empManagement;

import java.util.ArrayList;

public class EmployeeDriver {

	public static void main(String[] args) {
		EmployeeDriver e = new EmployeeDriver();
		
		
		ArrayList<Employee> eList = new ArrayList<>();
		e.populate(eList);
		
		System.out.println(eList);
	}

	private void populate(ArrayList<Employee> eList) {
		eList.add(new Employee("Abhishek","SSE",40000.4563 , "Bangalore"));
		eList.add(new Employee("Abhishe","SSE",50000.4563 , "Bangalore"));
		eList.add(new Employee("Abh","SSE",60000.4563 , "Bangalore"));
		eList.add(new Employee("Abhi","SSE",70000.4563 , "Bangalore"));
		eList.add(new Employee("Abhis","SSE",80000.4563 , "Bangalore"));
		eList.add(new Employee("Abhish","SSE",90000.4563 , "Bangalore"));
		
		
	}

}
