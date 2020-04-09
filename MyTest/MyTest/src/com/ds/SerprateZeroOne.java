package com.ds;

public class SerprateZeroOne {

	public static void main(String[] args) {
		int[] a = { 1, 0, 2, 0, 0, 1, 2, 2, 1, 2 };
		sort012(a, a.length);

	}

	static void sort012(int a[], int arr_size) {
		int lo = 0;
		int hi = arr_size - 1;
		int mid = 0, temp = 0;
		while (mid <= hi) {
			switch (a[mid]) {
			case 0: {
				temp = a[lo];
				a[lo] = a[mid];
				a[mid] = temp;
				lo++;
				mid++;
				break;
			}
			case 1:
				mid++;
				break;
			case 2: {
				temp = a[mid];
				a[mid] = a[hi];
				a[hi] = temp;
				hi--;
				break;
			}
			}
		}
		for (int i : a) {
			System.out.print(i + " ");
		}
	}

	private static void sortB(int[] a) {

		int low = 0;
		int mid = 0;
		int high = a.length - 1;

		while (mid <= high) {
			switch (a[mid]) {
			case 0:
				int temp = a[low];
				a[low] = a[mid];
				a[mid] = temp;
				low++;
				mid++;
				break;

			case 1:
				mid++;
				break;

			case 2:
				int temp1 = a[high];
				a[high] = a[mid];
				a[mid] = temp1;
				high--;
				mid++;
				break;
			}
		}
		for (int i : a) {
			System.out.print(i + " ");
		}

	}

	private static void sort(int[] a) {
		int s = 0, l = a.length - 1;
		int b[] = new int[a.length];
		for (int i = 0; i < a.length - 1; i++) {
			if (a[i] == 0)
				b[s++] = a[i];
			else if (a[i] == 2)
				b[l--] = a[i];
		}
		for (int j = s; j <= l; j++) {
			b[s++] = 1;
		}
		for (int val : b) {
			System.out.print(val + " ");
		}
	}

}
