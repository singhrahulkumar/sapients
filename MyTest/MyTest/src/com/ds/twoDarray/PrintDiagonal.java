package com.ds.twoDarray;

public class PrintDiagonal {

	public static void main(String[] args) {
		int[][] a = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
		printDiagonal(a, 4, 4);
	}

	private static void printDiagonal(int[][] a, int m, int n) {

		for (int i = 0; i < m; i++) {

			int k = 0;
			int l = i;
			while (l >= 0) {
				System.out.print(a[l--][k++] + " ");
			}
			System.out.println();
		}
		for (int k = 1; k < n; k++) {

			int i = n - 1;
			int j = k;
			while (j <= n - 1) {
				System.out.print(a[i--][j++] + " ");
			}
			System.out.println();

		}
	}

}
