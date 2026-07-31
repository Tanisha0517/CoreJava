package com.rays.io;

import java.io.FileWriter;

public class WriteTextFile {
	public static void main(String[] args) throws Exception {

//		FileWriter file = new FileWriter("C:\\Users\\Tanisha\\OneDrive\\Desktop\\IO Files\\Rays.txt");
		FileWriter file = new FileWriter("C:\\Users\\Tanisha\\OneDrive\\Desktop\\IO Files\\Rays.txt", true);

		file.write("\n");
		file.write("Hello");
		file.write("\n");
		file.write("Ayushi");

		System.out.println("Text Data Write Successfully");

		file.close();

	}
}
