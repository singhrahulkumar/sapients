package com.file;

import java.io.*;

public class RRFile {

	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("C:\\workspace_practices\\MyTest\\demoFile\\abc.txt",true);
		fw.write('b');
		fw.write("hishek Prasad\nI live in");
		char[] ch = {'b','g'};
		fw.write(ch);
		fw.write("\nFrom Ranchi");
		fw.flush();
		fw.close();
	}

}
