package com.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class ArrangeFileLines {

	public static void main(String[] args) throws FileNotFoundException {

		String fileName = "C:\\eclilpseCodespace\\codespacePractise\\MyTest\\MyTest\\demoFile\\abc.txt";
		Comparator<Integer> c = (i1, i2) -> {
			if (i1 > i2)
				return -1;
			else
				return 1;
		};
		Map<Integer, String> map = new TreeMap<>(c);
		getLines(fileName, map);

	}

	private static void getLines(String fileName, Map<Integer, String> map) throws FileNotFoundException {

		Scanner sc = new Scanner(new File(fileName));
		while (sc.hasNext()) {
			String s = sc.nextLine();
			String[] sarr = s.split(" ");
			map.put(sarr.length, s);
		}
		for (Entry<Integer, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}

	}

}
