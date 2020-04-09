
package com.practice;

public class MoveAllCapitalToEnd {

	public static void main(String[] args) {
		
		String str = "Geeksforgeeks A Computer Science Portal for Geeks!!";
		char[] b = new char[str.length()-1];
		char[] fullStr = new char[str.length()-1];
		int i =0,j=0;
		
		StringBuffer sb = new StringBuffer();
		for (char c : str.toCharArray()) {
			if(Character.isUpperCase(c)) {
				b[i++] = c;
			}else {
				fullStr[j++] = c;
			}
		}		
		for(char d:fullStr) {
			sb.append(d);
		}
		System.out.println("-->"+sb.toString());
		String s = sb.substring(0, j);
		StringBuffer sb1 = new StringBuffer(s);
		for(char d:b) {
			sb1.append(d);
		}
		System.out.println(sb1.toString());
	}

}
