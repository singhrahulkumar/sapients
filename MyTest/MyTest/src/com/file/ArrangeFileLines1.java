package com.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.Map.Entry;

public class ArrangeFileLines1 {

	public static void main(String[] args) throws FileNotFoundException {
		String fileName = "C:/Users/M1039239/Desktop/backup1712/abc.txt";

		Comparator<Integer> comparator = (i1, i2) -> ((i1 > i2) ? -1 : 1);
		TreeMap<Integer, String> map = new TreeMap<>(comparator);
		getLines(fileName, map);
	}

	private static void getLines(String fileName, TreeMap<Integer, String> map) throws FileNotFoundException {

		Scanner s = new Scanner(new File(fileName));
		while (s.hasNextLine()) {
			String line = s.nextLine();
			if (!line.equals("")) {
				line = line.trim();
				String[] sarr = line.split(" ");
				map.put(sarr.length, line);
			}
		}

		for (Entry<Integer, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
	}

}
