package com.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountWord {

	public static void main(String[] args) throws FileNotFoundException {

		Map<String, Integer> map = new HashMap<>();
		getWords("C:/Users/M1039239/Desktop/backup1712/abc.txt", map);

	}

	private static void getWords(String fileName, Map<String, Integer> map) throws FileNotFoundException {

		Scanner sc = new Scanner(new File(fileName));
		int i = 0;
		
		 // while (sc.hasNextLine()) { map.put(sc.nextLine(), i++); }
		 

		while (sc.hasNext()) {
			String key = sc.next();
			if (map.containsKey(key))
				map.put(key, map.get(key) + 1);
			else
				map.put(key, 1);
		}
		  
		
		System.out.println(map);

	}

}
