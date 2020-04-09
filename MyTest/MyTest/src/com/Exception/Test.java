package com.Exception;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Test {

	public static void main(String[] args) throws FileNotFoundException, IOException {

		try(BufferedReader br = new BufferedReader(new FileReader("abc.txt"))) {
			
		}

	}

}
