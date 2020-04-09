package com.leetcode;

public class SearchInsertPosition {

	public static void main(String[] args) {
		int[] nums = { 1, 3, 5, 6 };
		int target = 7;
		int i = check(nums, target);
		System.out.println(i);
	}

	private static int check(int[] nums, int target) {
		int j = 0;
		for (int i = 0; i<nums.length ; i++) {
			if (nums[i] >= target) {
				return i;
			}
			j = i;
		}
		return j+1;
	}

}
