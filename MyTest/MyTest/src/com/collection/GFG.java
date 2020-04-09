package com.collection;

import java.util.ArrayList;
import java.util.List;

public class GFG {

	public static Integer findMin(List<Integer> list) {

		Integer min = list.get(0);
		for (Integer i : list) {
			if (i < min) {
				min = i;
			}
		}
		return min;

	}

	public static Integer findMax(List<Integer> list) {
		Integer max = list.get(0);
		for (Integer i : list) {
			if (i > max) {
				max = i;
			}
		}
		return max;
	}

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(44);
		list.add(11);
		list.add(22);
		list.add(33);

		System.out.println("Min: " + findMin(list));
		System.out.println("Max: " + findMax(list));
	}
}
