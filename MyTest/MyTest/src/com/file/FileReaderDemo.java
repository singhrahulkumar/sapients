package com.file;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {

	public static void main(String[] args) throws IOException {

		FileReader f = new FileReader("C:\\workspace_practices\\MyTest\\demoFile\\abc.txt");
		int i = f.read();
		int c = 0;
		while (i != -1) {
			
			if('\n'==(char)i) {
				c++;
			}
			System.out.print((char) i);
			i = f.read();
			
		}
		System.out.println();
		System.out.println("no of new line "+c);

	}

}
