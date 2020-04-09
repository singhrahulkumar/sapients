package com.predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class User {

	String name, role;

	User(String a, String b) {
		name = a;
		role = b;
	}

	String getRole() {
		return role;
	}

	String getName() {
		return name;
	}

	public String toString() {
		return "User Name : " + name + ", Role :" + role;
	}

	public static void main(String[] args) {

		List<User> users = new ArrayList<User>();
		users.add(new User("John", "admin"));
		users.add(new User("Peter", "member"));
		List<User> admins = process(users, (User u) -> u.getRole().equals("admin"));
		System.out.println(admins);

	}

	private static List<User> process(List<User> users, Predicate<User> predicate) {
		List<User> result = new ArrayList<>();
		for (User u : users) {
			if (predicate.test(u)) {
				result.add(u);
			}
		}

		return result;
	}

}
