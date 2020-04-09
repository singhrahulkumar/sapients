package com.ds;

public class SearchElementSortedAndRotatedArrayMain {

	public static void main(String[] args) {
		int arr[] = { 16, 19, 21, 25, 3, 5, 8, 10 };
		System.out.println("Index of element 5 : " + findElementRotatedSortedArray(arr, 0, arr.length - 1, 5));
	}

	public static int findElementRotatedSortedArray(int[] arr, int low, int high, int number) {

		while (low <= high) {
			int mid = (high + low) / 2;
			// find weather left part is sorted or right part is sorted
			if (arr[mid] == number)
				return mid;
			// if below condition passed then right part is sorted
			if (arr[mid] < arr[high]) {
				if (number > arr[mid] && number <= arr[high]) {
					low = mid + 1;
				} else {
					high = mid - 1;
				}
			}
			// left part is sorted
			else {
				if (arr[low] <= number && number < arr[mid]) {
					high = mid - 1;
				} else {
					low = mid + 1;
				}
			}

		}

		return -1;
	}
}
