package com.leetcode;

public class MaxSum {
	public static void main(String[] args) {
		int[] a = { -2, -3, 4, -1, -2, 1, 5, -3 };
		System.out.println(maxSubArray(a));
	}

	public static int maxSubArray(int[] nums) {

		int sum = nums[0], res = nums[0];

		for (int i = 1; i < nums.length; i++) {
			sum = sum<0 ? nums[i] : sum + nums[i];
			res = Math.max(sum, res);
		}
		return res;

	}
}
