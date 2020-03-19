package com.examples;
import java.io.*;

public class Input_Char {
	private static char input;
	public static void main(String[] args) {
		System.out.print("Enter a text: ");
		try {
			input = (char)System.in.read();
			System.out.println(String.format("input = %c", input));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
