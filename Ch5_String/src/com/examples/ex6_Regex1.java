package com.examples;
import java.util.Scanner;
import java.io.*;

public class ex6_Regex1 {

	public static void main(String[] args) {
		String s1;
		Scanner inputObj = new Scanner(System.in);
		
		System.out.print("Enter a s1: ");
		s1 = inputObj.nextLine();
		
		System.out.println("s1: " + s1);
		
		if(s1.matches("[Aa]llan")) {
			System.out.println("Hi Allan!");
		}
		else {
			System.out.println("Who are you?");
		}

	}

}
