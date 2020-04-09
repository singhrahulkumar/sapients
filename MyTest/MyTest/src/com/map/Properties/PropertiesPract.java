package com.map.Properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesPract {

	public static void main(String[] args) throws IOException {

		Properties p = new Properties();
		FileInputStream f = new FileInputStream("C:/self/abc.properties");
		p.load(f);
		System.out.println(p);
		String s = p.getProperty("1");
		System.out.println(s);
		p.setProperty("4", "krish");
		System.out.println(p);
		p.setProperty("2", "Ram");
		FileOutputStream fos = new FileOutputStream("C:/self/abc.properties");
		p.store(fos, "updated");

	}

}
