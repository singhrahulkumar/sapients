package com.datastructure.binarySearchTree;

public class LeaderInArray {

	public static void main(String[] args) {
		int[] a = { 15, 16, 3, 2, 6, 1, 4 };

		leaderInArray(a);
	}

	private static void leaderInArray(int[] a) {

		int max = a[a.length - 1];
		for (int i = a.length - 2; i >= 0; i--) {
			if (a[i] > max) {
				System.out.print(a[i] + " ");
				max = a[i];
			}
		}
	}

}
