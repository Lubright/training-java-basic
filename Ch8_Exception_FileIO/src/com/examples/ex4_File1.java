package com.examples;
import java.io.*;
import java.util.Date;

public class ex4_File1 {

	public static void main(String[] args) {
		File file = new File("D:\\temp\\test1.cpp");
		
		System.out.println("file object�O�_�s�b: " + file.exists());
		System.out.println("file object�O�_���ɮ�: " + file.isFile());
		System.out.println("file object�O�_�i�HŪ��:  " + file.canRead());
		System.out.println("file object�O�_�g�J: " + file.canWrite());
		System.out.println("file object�O�_��ڦW�٬�: " + file.getName());
		System.out.println("file object�O�_�ק�����: " + new Date(file.lastModified()));
		System.out.println("file object�O�_�j�p��: " + file.length() + "Bytes");
		System.out.println("file object�O�_������|��: " + file.getAbsolutePath());
		System.out.println("file object�O�_���|��: " + file.getParent());
		
	}

}
