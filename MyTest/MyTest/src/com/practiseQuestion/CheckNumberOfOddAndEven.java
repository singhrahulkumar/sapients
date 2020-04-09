package com.practiseQuestion;

public class CheckNumberOfOddAndEven {

	public static void main(String[] args) {

		int n = 2456;
		int ce = 0;
		int co = 0;
		while(n>0) {
			int d = n%10;
			if(d%2==0)
				ce++;
			else
				co++;
			n = n/10;
		}
		
		System.out.println(ce+":"+co);
		
	}

}
