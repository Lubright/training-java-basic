package com.examples.ex10_BufferedReaderMarkReset;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex10_BufferedReaderMarkResetDemo {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = null;
		BufferedReader buf = null;
		
		try{
			fis = new FileInputStream("test_file1.txt");
			buf = new BufferedReader(new InputStreamReader(fis, "UTF-8"));
			String currentPath = System.getProperty("user.dir");
			System.out.println("currentPath = " + currentPath);
			
			char c = (char) buf.read();
			System.out.println(c); // t
			c = (char) buf.read();
			System.out.println(c); // e
			
			buf.mark(99); // make a mark			
			System.out.println("mark99...");
			
			c = (char) buf.read();
			System.out.println(c); // s
			c = (char) buf.read();
			System.out.println(c); // t
			
			buf.reset(); // return to mark position
			System.out.println("reset...");
			
			c = (char) buf.read();
			System.out.println(c); // s
			c = (char) buf.read();
			System.out.println(c); // t
			
			c = (char) buf.read();
			System.out.println(c); // 1
			
			buf.mark(154); // make a mark			
			System.out.println("mark154...");
			
			c = (char) buf.read();
			System.out.println(c); // 2
			c = (char) buf.read();
			System.out.println(c); // 3
			
			buf.reset(); // return to mark position
			System.out.println("reset...");
			
			c = (char) buf.read();
			System.out.println(c); // 2
			c = (char) buf.read();
			System.out.println(c); // 3
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
		finally{
			if(fis != null)
				fis.close();
			if(buf != null){
				buf.close();
			}
		}
		
		
	}

}
