package com.examples;

public class ex1_String {

	public static void main(String[] args) {
		// �ϥΦr��`�ƫإߦr��
		String s1 = new String("First String");
		System.out.println("s1 = " + s1);
		
		// �ϥ� char[] �إߦr��
		char c[] = {'S', 'e', 'c', 'o', 'n', 'd', ' ', 'S', 't', 'r', 'i', 'n', 'g'};
		String s2 = new String(c);
		System.out.println("s2 = " + s2);
		
		// �������w�r��`��
		String s3 = "Third String";
		System.out.println("s3 = " + s3);

	}

}
