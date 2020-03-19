package com.examples;
import java.io.*;
import java.util.Date;

public class ex7_FileReader1 {

	public static void main(String[] args) throws IOException {
		File file = new File("test_file1.txt");
		FileReader fin = new FileReader(file);
		
		if(file.exists())
			showFileContent(fin);
		
	}
	
	public static void showFileContent(FileReader fin) throws IOException {
		
		int c;
		
		while( (c = fin.read()) != -1 ) {
			
			System.out.print((char)c);
			
		}
		
		fin.close();
		
	}

}
