package com.practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ReadTextAndSort {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(
				new FileReader("C:\\eclilpseCodespace\\codespacePractise\\MyTest\\MyTest\\demoFile\\abc1301.txt"));

		ArrayList<String> list = new ArrayList<>();
		String s = br.readLine();
		while (s != null) {
			String[] str = s.split(" ");
			Arrays.sort(str);
			for (String s1 : str) {
				list.add(s1);
			}
			s = br.readLine();
		}
		Collections.sort(list);

		try (BufferedWriter bw = new BufferedWriter(
				new FileWriter("C:\\eclilpseCodespace\\codespacePractise\\MyTest\\MyTest\\demoFile\\abc1301_1.txt"))) {
			for (String string : list) {
				bw.write(string);
				bw.newLine();
			}
		}

		System.out.println("End of program");
	}

}
