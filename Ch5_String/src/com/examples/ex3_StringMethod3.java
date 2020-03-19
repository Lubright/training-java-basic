package com.examples;

public class ex3_StringMethod3 {

	static void hr(char c, int n)
	{
		for(int i=0; i<n; i++)
		{
			System.out.print(c);
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		String s1 = " test123 ";
		String result;
		
		System.out.println("s1: " + s1);
		
		// trim
		result = s1.trim();
		System.out.println("trim: " + result);
		
		hr('-', 50);
		
		// concat
		result = s1.trim() + "_ABC";
		System.out.println("concat: " + result);
		
		hr('-', 50);
		
		// substring
		result = s1.substring(1,3);
		System.out.println("substring: " + result);
		
		hr('-', 50);
		
		// replace
		result = s1.replace("test", "abc");
		System.out.println("replace: " + result);
		
		hr('-', 50);
		
		// split
		String[] arr = s1.split("1");
		for(int i=0; i<arr.length; i++) {
			System.out.println(i+": "+arr[i]);
		}
		

	}

}
