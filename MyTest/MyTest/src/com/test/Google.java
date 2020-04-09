package com.test;

import java.util.Arrays;

public class Google {
	public static void main(String[] args) {
		int[] values = new int[10];
		Arrays.fill(values, 4);
		for (int value : values) {
			System.out.print(value);
			System.out.print(' ');
		}
	}
}
