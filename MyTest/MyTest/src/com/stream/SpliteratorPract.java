package com.stream;

import java.util.ArrayList;
import java.util.Spliterator;
import java.util.stream.Stream;

public class SpliteratorPract {
	public static void main(String[] args) {

		int n = 5;

		ArrayList<Integer> arrli = new ArrayList<Integer>(n);

		for (int i = 1; i <= n; i++)
			arrli.add(i);

		System.out.println(arrli);

		arrli.remove(Integer.valueOf(3));

		System.out.println(arrli);

		for (int i = 0; i < arrli.size(); i++)
			System.out.print(arrli.get(i) + " ");
	}
}
