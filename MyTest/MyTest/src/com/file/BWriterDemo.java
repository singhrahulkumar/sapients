package com.file;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BWriterDemo {

	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("C:\\workspace_practices\\MyTest\\demoFile\\abcBW.txt");
		BufferedWriter br = new BufferedWriter(fw);
		br.write('a');
		br.write("bhishek Prasad");
		br.newLine();
		br.write("I live in");
		char[] ch = { 'b', 'g' };
		br.write(ch);
		br.write("\nFrom Ranchi");
		br.flush();
		br.close();
	}

}
