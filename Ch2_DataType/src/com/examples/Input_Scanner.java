package com.examples;
import java.io.*;
import java.util.Scanner;

public class Input_Scanner {

	public static void main(String[] args) {
		
		Scanner inputObj = new Scanner(System.in);
		
		// input: String type
		System.out.print("�п�J�r��: ");
		String s1 = inputObj.nextLine();
		System.out.println("s1 = " + s1);
		
		// input: Integer type
		System.out.print("�п�J���: ");
		int a = inputObj.nextInt();
		System.out.println("a = " + a);
		
		// input: Double type
		System.out.print("�п�J�B�I��: ");
		double b = inputObj.nextDouble();
		System.out.println("b = " + b);

	}

}
