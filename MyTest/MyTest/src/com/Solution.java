package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Solution {

	public static void main(String[] args) {
		List<Integer> myList = new ArrayList<>();
		myList.add(5);
		myList.add(3);
		myList.add(5);
		myList.add(7);
		myList.add(10);
		myList.add(14);
		myList.add(6);

		Solution s1 = new Solution();
		System.out.println("before: " + myList.toString());
		System.out.println("after: " + s1.rearrangeList(myList).toString());
	}

	public List<Integer> rearrangeList(List<Integer> theList) {

		Comparator<Integer> c = (Integer n1, Integer n2) -> {
			int res = 0;
			if (n1 == n2) {
				res = 0;
			} else if (Integer.bitCount(n1) < Integer.bitCount(n2)) {
				res = -1;
			} else if (Integer.bitCount(n1) > Integer.bitCount(n2)) {
				res = 1;
			} else if (Integer.bitCount(n1) == Integer.bitCount(n2)) {
				res = (n1 < n2) ? -1 : 1;
			}
			return res;
		};

		Collections.sort(theList, c);
		return theList;
	}

}
