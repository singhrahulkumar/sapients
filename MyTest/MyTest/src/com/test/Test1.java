package com.test;

import java.util.ArrayList;
import java.util.List;

public class Test1 {

	public static void main(String[] args) {

		List<Integer> al = new ArrayList<>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		
		Object[] arr = al.toArray();
		System.out.println(arr.length);
		arr[4] = 6;
		for (Object integer : arr) {
			System.out.println(integer);
		}
	}

}
