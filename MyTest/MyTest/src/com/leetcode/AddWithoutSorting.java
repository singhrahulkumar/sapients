package com.leetcode;

import java.util.HashMap;
import java.util.Map;

public class AddWithoutSorting {

	public static void main(String[] args) {
		int nums[] = { 3, 2, 4 };
		int target = 6;
		AddWithoutSorting a = new AddWithoutSorting();
		int[] arr = a.twoSum(nums, target);
		for (int i : arr) {
			System.out.print(i + ":");
		}
	}

	public int[] twoSum(int[] nums, int target) {

		int[] arr = new int[2];
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			map.put(nums[i], i);
		}
		for (int i = 0; i < nums.length - 1; i++) {
			int secondNum = target - nums[i];
			if (map.containsKey(secondNum) && map.get(secondNum) != i) {
				arr[0] = map.get(secondNum);
				arr[1] = i;
			}
		}
		return arr;
	}

}
