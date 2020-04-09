package com.functions;

import java.util.Scanner;
import java.util.function.Function;

public class FunctionAuth {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("UserName");
		String userName = sc.next();
		System.out.println("Password");
		String password = sc.next();

		System.out.println(userName + " " + password);

		Function<String, String> f = s -> s.substring(0, 5);
		Function<String, String> f1 = s -> s.toLowerCase();

		System.out.println(f.andThen(f1).apply(userName));

		if (f.andThen(f1).apply(userName).equals("abhis") && password.equals("abhi"))
			System.out.println("Login");
		else
			System.out.println("Login fail");

	}

}
