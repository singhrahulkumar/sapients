package com.functions;

import java.util.function.Function;

public class RemoveSpace {

	public static void main(String[] args) {

		String s = "My Name is Abhishek Prasad";
		Function<String, String> f = a -> a.replaceAll(" ", "");
		
		String s1 = f.apply(s);
		System.out.println(s1);

	}

}
