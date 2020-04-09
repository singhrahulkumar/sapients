package com.hacker;

import java.util.Arrays;

public class Anar {

	public static void main(String[] args) {
		String a = "khsihba";
		String b = "abhishk";
		
		a = a.toUpperCase();
		b = b.toUpperCase();
		char[] ar = a.toCharArray();
		char[] br = b.toCharArray();
		
		Arrays.sort(ar);
		Arrays.sort(br);
		
		String a1 = new String(ar);
		String b1 = new String(br);
		System.out.println(a1 + " " + b1);
		boolean flag = true;
		if (ar.length != br.length) {
			flag = false;
		} else {
			for(int i = 0 ; i<ar.length;i++) {
				if(ar[i] != br[i]) {
					flag = false;
					break;
				}
			}
			
		}
		if (flag) {
			System.out.println("Anargram");
		} else {
			System.out.println("Not Anargram");
		}

	}

}
