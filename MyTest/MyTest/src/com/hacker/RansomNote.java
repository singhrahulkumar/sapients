package com.hacker;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class RansomNote {

	public static void main(String[] args) {
		String s1 = "give me one grand today night";
		String[] s1Arr = s1.split(" ");
		String s2 = "give one grand today";
		String[] s2Arr = s2.split(" ");
		check(s1Arr, s2Arr);
	}

	private static void check(String[] magazine, String[] note) {

		HashMap<String, Integer> map = new HashMap<>();
		for (String s : magazine) {
			if (map.containsKey(s))
				map.put(s, map.get(s) + 1);
			else
				map.put(s, 1);
		}
		boolean flag = false;
		for(String s : note) {
			if(map.containsKey(s)) {
				if(map.get(s) != 0) {
					map.put(s, map.get(s)-1);
				}else if(map.get(s) == 0) {
					flag = true;
					break;
				}
			}else {
				flag = true;
				break;
			}
		}
		if(flag) 
			System.out.println("No");
		else
			System.out.println("Yes");

	}

}
