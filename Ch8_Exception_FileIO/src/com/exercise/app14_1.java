package com.exercise;

import java.io.*;

// using FileReader to read file

public class app14_1 {

	public static void main(String[] args) throws IOException {
		char data[] = new char[128]; // create a 128 char array
		FileReader fr = new FileReader("./test_file1.txt"); // create a FileReader instance
		
		int len = fr.read(data); // read and store to char array
		System.out.println("len = " + len);
		String s1 = new String(data, 0, len); // char[] to String
		System.out.println("s1 = " + s1);

		fr.close();
	}

}
