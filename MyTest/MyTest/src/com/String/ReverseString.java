package com.String;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseString {

	public static void main(String[] args) {
		String s = "Abhishek Prasad";
		byte[] rev = s.getBytes();
		byte[] result = new byte[s.length()];
		int j = 0;
		for (int i = rev.length - 1; i >= 0; i--) {
			result[j++] = rev[i];
		}
		System.out.println(new String(result));

		//--------------------------------------------------------------------
		char[] arr = s.toCharArray();
		char[] resultChar = new char[s.length()];
		int m = 0;
		for (int i = arr.length - 1; i >= 0; i--) {
			resultChar[m++] = arr[i];
		}
		System.out.println(new String(resultChar));
		//--------------------------------------------------------------------
		System.out.println("check  :"+s);
		char[] arrStr = s.toCharArray();
		
		for (int i = 0, k = s.length()-1; i < k; i++, k--) {
			char temp = arrStr[k];
			arrStr[k] = arrStr[i];
			arrStr[i] = temp;
		}
		System.out.println(new String(arrStr));
		
		//using collection
		s = "Abhishek Prasad";
		char[] chList = s.toCharArray();
		List<Character> charList = new ArrayList<Character>();
		for(char c : chList) {
			charList.add(c);
		}
		Collections.reverse(charList);;
		System.out.println(charList);
		
		
	}

}
