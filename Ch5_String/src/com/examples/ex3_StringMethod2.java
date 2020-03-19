package com.examples;

public class ex3_StringMethod2 {

	static void hr(char c, int n)
	{
		for(int i=0; i<n; i++)
		{
			System.out.print(c);
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		String s1 = "¦r¦êªº¾Þ§@ABc";
		
		System.out.println("s1: " + s1);
		
		// charAt()
		char c1 = s1.charAt(1);
		System.out.println("c1: " + c1);
		
		// find string index
		String findStr = "AB";
		int index1 = s1.indexOf(findStr);
		System.out.println("index1:" + index1);
		
		int index2 = s1.lastIndexOf(findStr);
		System.out.println("index2:" + index2);
		
		String findStr2 = "AB"+"C";
		System.out.println("findStr2:" + findStr2);
		
		int index3 = s1.lastIndexOf(findStr2);
		System.out.println("index3:" + index3);
		
	}

}
