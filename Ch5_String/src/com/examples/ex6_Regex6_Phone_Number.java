package com.examples;
import java.util.Scanner;

public class ex6_Regex6_Phone_Number {
	
	static boolean checkPhoneNumber(String input)
	{
		String pattern_phone = "(\\d{4}\\-?\\d{3}\\-?\\d{3}|\\(?\\d{2}\\)?\\-?\\d{4}\\-?\\d{4})";
		
		if(input.matches(pattern_phone)) {
			return true;
		}
		else {
			return false;
		}
		
	}

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String input_str;
		
		System.out.print("Enter your phone number: ");
		input_str = input.nextLine();
		
		if(checkPhoneNumber(input_str)) {
			System.out.println(input_str + " matched pattern_phone.");
		}
		else {
			System.out.println(input_str + " does not matched pattern_phone.");
		}

	}

}
