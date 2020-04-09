package com.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class CountWord1 {

	public static void main(String[] args) throws FileNotFoundException {
		HashMap<String, Integer> map = new HashMap<>();
		getWords("C:\\eclilpseCodespace\\codespacePractise\\MyTest\\MyTest\\demoFile\\abc0503.txt", map);
	}

	private static void getWords(String string, HashMap<String, Integer> map) throws FileNotFoundException {

		Scanner sc = new Scanner(new File(string));
		while (sc.hasNext()) {
			String key = sc.next();
			if (map.containsKey(key))
				map.put(key, map.get(key) + 1);
			else
				map.put(key, 1);
		}

		Integer maxValue = map.entrySet().iterator().next().getValue();
		String key = "";

		for (Entry<String, Integer> s : map.entrySet()) {
			System.out.print(s.getKey() + " ");
			System.out.println(s.getValue());
			if (s.getValue() > maxValue) {
				maxValue = s.getValue();
				key = s.getKey();
			}
		}

		System.out.println("Maximum occuring word :" + key);
	}

}
