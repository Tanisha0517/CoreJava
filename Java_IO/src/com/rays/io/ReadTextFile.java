package com.rays.io;

import java.io.FileReader;

public class ReadTextFile {
	public static void main(String[] args) throws Exception {
		
		//FileReader is c Class 
		FileReader file = new FileReader("C:\\Users\\Tanisha\\OneDrive\\Desktop\\IO Files\\Rays.txt");
		int i = file.read();

		while (i != -1) {
			System.out.println((char) i + " = " + i);
			i = file.read();
		}

		file.close();

	}
}
