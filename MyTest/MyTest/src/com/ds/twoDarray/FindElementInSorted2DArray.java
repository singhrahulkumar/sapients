package com.ds.twoDarray;

public class FindElementInSorted2DArray {

	public static void main(String[] args) {
		int[][] a = { { 10, 20, 30, 40 }, { 12, 22, 33, 45 }, { 14, 24, 44, 47 }, { 16, 26, 46, 50 } };
		findElement(a, 4, 4, 24);
	}

	private static void findElement(int[][] a, int m, int n, int num) {
		int i = 0;
		int j = n - 1;
		while (i <= (m - 1) && j >= 0) {
			if (a[i][j] == num) {
				System.out.println(i + " " + j);
				break;
			} else if (a[i][j] > num)
				j--;
			else if (a[i][j] < num)
				i++;
		}

	}

}
