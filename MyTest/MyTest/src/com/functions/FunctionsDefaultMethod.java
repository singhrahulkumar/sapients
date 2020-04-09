package com.functions;

import java.util.function.Function;

public class FunctionsDefaultMethod {

	public static void main(String[] args) {

		Function<String, String> f = s -> s.toUpperCase();
		Function<String, String> f1 = s -> s.substring(0, 9);

		String s1 = "abhishekprasadchotu";
		String s = f.andThen(f1).apply(s1);
		
		check(f.andThen(f1),s1);
		System.out.println(s);
		System.out.println(f.compose(f1).apply(s1));
		
	}

	private static void check(Function<String, String> f, String s1) {
		System.out.println(f.apply(s1));
	}

}
