package com.leetcode;

import java.util.Arrays;

public class AddTwoNumberTarget {

	public static void main(String[] args) {
		int nums[] = { 3, 2, 4 };
		int target = 6;
		AddTwoNumberTarget a = new AddTwoNumberTarget();
		int[] arr = a.twoSum(nums, target);
		for (int i : arr) {
			System.out.print(i + ":");
		}
	}

	public int[] twoSum(int[] nums, int target) {
		int[] arr = new int[2];
		int i = 0;
		int j = nums.length - 1;
		Arrays.sort(nums);
		while (i < j) {
			if ((nums[i] + nums[j]) > target) {
				j--;
			} else if ((nums[i] + nums[j]) < target) {
				i++;
			} else if((nums[i] + nums[j]) == target){
				arr[0] = i;
				arr[1] = j;
				i++;
			}
		}
		return arr;
	}

}
