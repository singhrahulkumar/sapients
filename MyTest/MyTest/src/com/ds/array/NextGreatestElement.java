package com.ds.array;

import java.util.Stack;

public class NextGreatestElement {

	public static void main(String[] args) {
		int[] arr = { 98, 23, 54, 12, 20, 71, 27 };
		findNextGreater(arr);
	}

	private static void findNextGreater(int[] arr) {
		Stack<Integer> s = new Stack<>();
		s.push(arr[0]);
		for (int i = 1; i < arr.length; i++) {
			while (!s.isEmpty() && s.peek() < arr[i]) {
				System.out.println(s.pop() + "-->" + arr[i]);
			}
			s.push(arr[i]);
		}
		while (!s.isEmpty()) {
			System.out.println(s.pop() + "-->" + null);
		}
	}
}
