package com.exercise;

import java.io.*;

// use buffer to read data

public class app14_3 {

	public static void main(String[] args) {

		try {
			FileReader fr = new FileReader("./test_file1.txt");
			BufferedReader buf = new BufferedReader(fr);
			
			showFileContentWithReadLine(buf);
			
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
		
		
		

	}
	
	public static void showFileContentWithReadLine(BufferedReader fin) throws IOException {

		String s1;

		while( (s1 = fin.readLine()) != null ) {

			System.out.println(s1);

		}

		fin.close();

	}

}
