package com.file;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BReaderDemo {

	public static void main(String[] args) throws IOException {
		FileReader f = new FileReader("C:\\workspace_practices\\MyTest\\demoFile\\abcBW.txt");
		
		BufferedReader br = new BufferedReader(f);
		String s = br.readLine();
		
		while(s != null) {
			System.out.println(s);
			s = br.readLine();
		}
		
	}

}
