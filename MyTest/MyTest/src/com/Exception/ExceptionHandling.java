package com.Exception;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class ExceptionHandling {

	public static void main(String[] args) throws FileNotFoundException, InterruptedException  {

		PrintWriter pw = new PrintWriter("abc.txt");
		pw.println("HEllo");
		
		
		Thread.sleep(10000);
	}

}
