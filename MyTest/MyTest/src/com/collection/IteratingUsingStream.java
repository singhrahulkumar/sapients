package com.collection;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class IteratingUsingStream {

	public static void main(String[] args) {

		Integer[] arr = {1,5,4,6,8,4,6,9,3};
		List<Integer> list = Arrays.asList(arr);
		//Consumer<Integer> c = s -> System.out.println(s);
		list.forEach(l -> System.out.println(l));

	}

}
