package com.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.Scanner;

public class ReadingAFile {

	public static void main(String[] args) throws IOException, InterruptedException {

		File file = new File("C:/Users/M1039239/Desktop/backup1712/abc.txt");

		BufferedReader br = new BufferedReader(new FileReader(file));

		String st;
		/*
		 * while ((st = br.readLine()) != null) System.out.println(st);
		 */
		FileReader fr = new FileReader("C:/Users/M1039239/Desktop/backup1712/abc.txt");

		int i;
		/*
		 * while ((i = fr.read()) != -1) { Thread.sleep(10); System.out.print((char) i);
		 * }
		 */

		File file1 = new File("C:/Users/M1039239/Desktop/backup1712/abc.txt");
		Scanner sc = new Scanner(file1);

		// we just need to use \\Z as delimiter
		sc.useDelimiter("\\Z");

		System.out.println(sc.next());

	}

}
