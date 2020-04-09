package com.functions;

import java.util.function.Function;

public class FunctionsDemo {

	public static void main(String[] args) {

		FunctionLambda fl = i -> i*i; 
		Function<String, Integer> f = s -> s.length();
		
		System.out.println(f.apply("Abhishek"));
		System.out.println(fl.square(2));

	}

}
