package com.examples;

public class ex1_String {

	public static void main(String[] args) {
		// 使用字串常數建立字串
		String s1 = new String("First String");
		System.out.println("s1 = " + s1);
		
		// 使用 char[] 建立字串
		char c[] = {'S', 'e', 'c', 'o', 'n', 'd', ' ', 'S', 't', 'r', 'i', 'n', 'g'};
		String s2 = new String(c);
		System.out.println("s2 = " + s2);
		
		// 直接指定字串常數
		String s3 = "Third String";
		System.out.println("s3 = " + s3);

	}

}
