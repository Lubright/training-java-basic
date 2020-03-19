package com.examples;
import java.io.*;
import java.util.Date;

public class ex6_File_Rename {

	public static void main(String[] args) {
		
		rename("D:\\temp\\test2.cpp", "D:\\temp\\test1.cpp");

	}
	
	public static void rename(String srcFileName, String destFileName) {
		
		File fs = new File(srcFileName);
		File fd = new File(destFileName);
		
		if(fs.exists() && !fd.exists()) { // fs存在 && fd不存在
			if(fs.renameTo(fd)) {
				System.out.println(fs.getName() + " is rename to " + fd.getName());
			}
		}
		
	}

}
