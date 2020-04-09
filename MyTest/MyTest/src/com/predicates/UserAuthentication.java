package com.predicates;

import java.util.function.Predicate;

public class UserAuthentication {

	public static void main(String[] args) {

		Predicate<User> userAuth = user -> user.getUserName().equals("abhishek") && user.getPassword().equals("abhi");

		UserAuthentication user = new UserAuthentication();
		User u = new User();
		u.setUserName("abhishek");
		u.setPassword("abhi");

		boolean flag = user.check(userAuth, u);
		if (flag)
			System.out.println("Auth passes");
		else
			System.out.println("Auth fails");

	}

	private boolean check(Predicate<User> userAuth, User u) {

		return userAuth.test(u);
	}

}
