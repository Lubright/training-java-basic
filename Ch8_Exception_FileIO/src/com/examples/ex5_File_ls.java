package com.examples;
import java.io.*;
import java.util.Date;

public class ex5_File_ls {

	public static void main(String[] args) {

		ls("./");
		
	}
	
	public static void ls(String path) {
		
		File file = new File(path);
		File[] files = file.listFiles();
		
		System.out.println("path\t" + file.getAbsolutePath());
		
		for(int i=0; i<files.length; i++) {
			if(files[i].isDirectory()) {
				System.out.println("<Dir>\t" + files[i].getName());
			}
			else {
				System.out.println(String.format("%s\t%d Bytes", files[i].getName(), files[i].length()));
			}
		}
		
	}

}
