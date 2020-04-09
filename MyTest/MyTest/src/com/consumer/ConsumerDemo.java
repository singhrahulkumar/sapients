package com.consumer;

import java.util.function.Consumer;

public class ConsumerDemo {

	public static void main(String[] args) {

		Consumer<String> s = a -> System.out.println(a);
		
		s.accept("Abhishek");
		
	}

}
