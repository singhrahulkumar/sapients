package com.designPattern.facade;

import java.util.Arrays;

public class PairsWithGivenSum {

	public static void main(String[] args) {

		int a[] = { 5, 8, 3, 4, 2, 6, 10, 7, 1, 9 };
		Arrays.sort(a);
		for (int i : a) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		int sum = 11;
		int i = 0, j = a.length - 1;
		while (i < j) {
			if (a[i] + a[j] == sum) {
				System.out.println("Given pairs are: (" + a[i] + "," + a[j] + ")");
				i++;
			} else if (a[i] + a[j] > sum)
				j--;
			else if (a[i] + a[j] < sum)
				i++;
		}
	}

}
