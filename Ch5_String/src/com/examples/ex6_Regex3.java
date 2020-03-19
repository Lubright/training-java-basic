package com.examples;

public class ex6_Regex3 {

	public static void main(String[] args) {
		String testStr = "2011-12-31";
		
		/*
		 * 中式寫法：YYYY-MM-DD (2011-12-31)
		 * 西式寫法：MM/DD/YY (12/31/11)
		 * */
		
		String pattern = "\\d{1,4}[\\-/]\\d{1,2}[\\-/]\\d{1,4}";
		
		if(testStr.matches(pattern)) {
			System.out.println(testStr);
		}
		else {
			System.out.println("error!");
		}

	}

}
