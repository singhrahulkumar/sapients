package com.ds;

public class RemoveDuplicateElementUsingOneArray {

	public static void main(String[] args) {
		int nums[] = { 1, 1 };

		System.out.println(removeDuplicate(nums));

	}

	private static int removeDuplicate(int[] nums) {
		int i = 0;
		for (int j = 1; j < nums.length; j++) {
			if (nums[i] != nums[j]) {
				i++;
				nums[i] = nums[j];
			}
		}
		return i + 1;
	}

}
