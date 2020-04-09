package com.java8.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CompartorWithoutLamda {

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<>();
		al.add(10);
		al.add(0);
		al.add(15);
		al.add(5);
		al.add(20);

		Collections.sort(al, new MyCompartor());
		System.out.println(al);
	}

}

class MyCompartor implements Comparator<Integer> {

	@Override
	public int compare(Integer i1, Integer i2) {

		if (i1 < i2)
			return +1;
		else if (i1 > i2)
			return -1;
		return 0;
	}
}
