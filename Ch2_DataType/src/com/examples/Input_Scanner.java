package com.examples;
import java.io.*;
import java.util.Scanner;

public class Input_Scanner {

	public static void main(String[] args) {
		
		Scanner inputObj = new Scanner(System.in);
		
		// input: String type
		System.out.print("請輸入字串: ");
		String s1 = inputObj.nextLine();
		System.out.println("s1 = " + s1);
		
		// input: Integer type
		System.out.print("請輸入整數: ");
		int a = inputObj.nextInt();
		System.out.println("a = " + a);
		
		// input: Double type
		System.out.print("請輸入浮點數: ");
		double b = inputObj.nextDouble();
		System.out.println("b = " + b);

	}

}
