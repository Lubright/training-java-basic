package com.examples;
import java.util.Scanner;

public class ex6_Regex5_Http_url {
	
	// check http url
	static boolean checkUrl(String input)
	{
		String pattern_url = "https?://(www|\\w+)(\\.\\w+)+";
		
		if(input.matches(pattern_url)) {
//			System.out.print("test1");
			return true;
		}
		else {
//			System.out.print("test2");
			return false;
		}
		
	}

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a url: ");
		String input_str = input.nextLine();
		
		if(checkUrl(input_str)) {
			System.out.println(input_str + " matched pattern_url.");
		}
		else {
			System.out.println(input_str + " does not matched pattern_url.");
		}

	}

}
