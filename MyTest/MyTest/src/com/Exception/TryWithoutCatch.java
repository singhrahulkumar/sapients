package com.Exception;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryWithoutCatch {

	public static void main(String[] args) throws FileNotFoundException, IOException {

		try(BufferedReader br = new BufferedReader(new FileReader("abc.txt"))){
			System.out.println(10/0);
			
		}
		
	}

}
