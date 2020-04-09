package com.file;

import java.io.File;
import java.io.IOException;

public class FileDemi {

	public static void main(String[] args) throws IOException {

		// to create new file
		File file = new File("abc");
		System.out.println(file.exists());
		file.createNewFile();
		System.out.println(file.exists());

		// to create new directory
		File file1 = new File("dir");
		System.out.println(file1.exists());
		file1.mkdir();
		System.out.println(file1.exists());

		// to create new file in given dir
		File file2 = new File("dir", "abhi.txt");
		System.out.println(file2.exists());
		file2.createNewFile();
		System.out.println(file2.exists());

		// to check weather file or dir
		System.out.println(file.isFile());

		// f
		File file3 = new File("dir", "abhi1.txt");
		System.out.println(file3.exists());
		file3.createNewFile();
		System.out.println(file3.exists());

		// no of file in dir
		String[] s = file1.list();
		for (String string : s) {
			System.out.println(string);
		}

		// length of file
		Long l = file2.length();
		System.out.println(l);

		// delete
		boolean f = file3.delete();
		System.out.println(f);

		// create directory inside directory
		File file4 = new File("C:\\workspace_practices\\MyTest\\dir\\dir1");
		file4.mkdir();

		// create file
		File file5 = new File("C:\\workspace_practices\\MyTest\\dir\\dir1\\abhi11.txt");
		file5.createNewFile();

		// no of file in dir
		File file6 = new File("C:\\workspace_practices\\MyTest\\dir");
		System.out.println(file6.isDirectory());
		String[] s1 = file6.list();
		int c = 0;
		System.out.println("=====");
		for (String string : s1) {
			File file7 = new File("file6", string);
			if (file7.isFile()) {
				c++;
				System.out.println(string);
			}
		}
		System.out.println("no of file :" + c);

	}

}
