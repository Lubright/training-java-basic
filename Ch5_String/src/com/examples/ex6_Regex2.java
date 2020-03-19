package com.examples;

public class ex6_Regex2 {

	public static void main(String[] args) {
		String s1 = "cat11";
		
		if(s1.matches("(cat|dog|bird)\\d{1,2}")) {
			System.out.println("test1");
		}
		else {
			System.out.println("test2");
		}

	}

}
