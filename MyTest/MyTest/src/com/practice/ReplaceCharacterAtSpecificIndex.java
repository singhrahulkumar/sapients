package com.practice;

public class ReplaceCharacterAtSpecificIndex {

	public static void main(String[] args) {

		String str = "Geeks Gor Geeks";
		char strArr[] = str.toCharArray();
		char c = 'F';
		int index = 6;
		
		str = str.substring(0,index)+c+str.substring(index+1);
		/*for (int i = 0; i < str.length(); i++) {
			if (i == index)
				strArr[i] = c;
		}*/
		System.out.println(new String(str));

		// using substring
		String str1 = "Geeks Gor Geeks";
		str1 = str1.substring(0, index) + c + str1.substring(index + 1);
		System.out.println("using sub string " + str1);
	}

}
