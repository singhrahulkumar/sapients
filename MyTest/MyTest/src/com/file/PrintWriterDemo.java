package com.file;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrintWriterDemo {

	public static void main(String[] args) throws FileNotFoundException {

		PrintWriter p = new PrintWriter("C:\\workspace_practices\\MyTest\\demoFile\\abcPW.txt");
		p.write(100);
		p.println(100);
		p.println(true);
		p.println("abc");
		p.flush();
		p.close();
		
	}

}
