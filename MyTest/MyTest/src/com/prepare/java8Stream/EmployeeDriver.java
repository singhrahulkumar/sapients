package com.prepare.java8Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.OptionalInt;
import java.util.Set;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class EmployeeDriver {

	public static void main(String[] args) {

		List<Employee> employeeList = createEmployeeList();

		// name
		List<String> employeeNameList = employeeList.stream().filter(e -> e.getAge() > 20).map(Employee::getName)
				.collect(Collectors.toList());

		// age more than 25
		long count = employeeList.stream().filter(e -> e.getAge() > 25).count();

		System.out.println(employeeNameList);

		// emp with name mary
		List<Employee> eName = employeeList.stream().filter(e -> e.getName().equalsIgnoreCase("mary"))
				.collect(Collectors.toList());

		eName.stream().forEach(System.out::println);

		// maximum age
		OptionalInt max = employeeList.stream().mapToInt(Employee::getAge).max();
		if (max.isPresent())
			System.out.println(max.getAsInt());

		List<Employee> eSort = employeeList.stream().sorted((e1, e2) -> e1.getAge() - e2.getAge())
				.collect(Collectors.toList());
		eSort.stream().forEach(System.out::println);

		// groupBy
		Map<String, List<Employee>> groupByName = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getName));
		System.out.println(groupByName);
		Consumer<Map<String, List<Employee>>> consumer = e -> {
			Set<Entry<String, List<Employee>>> set = e.entrySet();
			for (Entry<String, List<Employee>> s : set) {
				System.out.print("Key :" + s.getKey());
				System.out.println(" Value :" + s.getValue());
			}
		};

		System.out.println("------------------------------------------------------");
		consumer.accept(groupByName);

		groupByName.forEach((name, eList) -> System.out.println(name + "===>" + eList));

	}

	public static List<Employee> createEmployeeList() {
		List<Employee> employeeList = new ArrayList<>();

		Employee e1 = new Employee("John", 21);
		Employee e2 = new Employee("Martin", 19);
		Employee e3 = new Employee("Mary", 31);
		Employee e4 = new Employee("Martin", 18);
		Employee e5 = new Employee("John", 26);

		employeeList.add(e1);
		employeeList.add(e2);
		employeeList.add(e3);
		employeeList.add(e4);
		employeeList.add(e5);

		return employeeList;
	}

}
