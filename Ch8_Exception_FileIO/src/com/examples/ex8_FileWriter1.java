package com.examples;
import java.io.*;
import java.util.Date;

public class ex8_FileWriter1 {

	public static void main(String[] args) throws IOException {
		
		File file = new File("test2.txt");
		FileWriter fout = new FileWriter(file);
		
		String s1 = "test123\r\n" + "´ú¸ÕÀÉ®×";
		
		fout.write(s1);
		fout.close();
	}

}
