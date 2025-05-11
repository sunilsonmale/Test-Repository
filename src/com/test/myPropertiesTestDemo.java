package com.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class myPropertiesTestDemo {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		Properties p = new Properties();

		try {
			p.load(new FileInputStream("abc.properties"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(p.propertyNames());
		System.out.println(p.getProperty("sunil"));
		System.out.println(p.getProperty("trupti"));
		System.out.println(p.getProperty("advik"));
		System.out.println(p.setProperty("trupti", "ravi jhav trupti"));
		System.out.println(p.setProperty("truptisex", "nagdi sex"));
		p.store(new FileOutputStream("abc.properties"), "trupti chad ravi");
		
	}
	
 

}
