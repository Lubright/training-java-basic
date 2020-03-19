package com.examples;
import java.io.*;
import java.util.Date;

public class ex4_File1 {

	public static void main(String[] args) {
		File file = new File("D:\\temp\\test1.cpp");
		
		System.out.println("file object是否存在: " + file.exists());
		System.out.println("file object是否為檔案: " + file.isFile());
		System.out.println("file object是否可以讀取:  " + file.canRead());
		System.out.println("file object是否寫入: " + file.canWrite());
		System.out.println("file object是否實際名稱為: " + file.getName());
		System.out.println("file object是否修改日期為: " + new Date(file.lastModified()));
		System.out.println("file object是否大小為: " + file.length() + "Bytes");
		System.out.println("file object是否絕對路徑為: " + file.getAbsolutePath());
		System.out.println("file object是否路徑為: " + file.getParent());
		
	}

}
