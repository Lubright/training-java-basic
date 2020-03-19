package com.examples;
import java.io.*;
import java.util.Date;

public class ex7_FileReader2 {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("test_file1.txt");
		BufferedReader buf = new BufferedReader(new InputStreamReader(fis, "UTF-8"));
		
		showFileContent(buf);
		
		System.out.println();
		
		fis = new FileInputStream("test_file1.txt");
		
		showFileContentWithReadLine(new BufferedReader(new InputStreamReader(fis, "UTF-8")));
		
	}
	
	public static void showFileContent(BufferedReader fin) throws IOException {
		
		int c;
		
		while( (c = fin.read()) != -1 ) {
			
			System.out.print((char)c);
			
		}
		
		fin.close();
		
	}
	
	public static void showFileContentWithReadLine(BufferedReader fin) throws IOException {
		
		String s1;
		
		while( (s1 = fin.readLine()) != null ) {
			
			System.out.println(s1);
			
		}
		
		fin.close();
		
	}

}
