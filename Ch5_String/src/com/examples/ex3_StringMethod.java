package com.examples;

public class ex3_StringMethod {

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
		int sLength = s1.length(); // length()
		
		System.out.println("sLength = " + sLength);
		
		hr('-', 50);
		
		//  str to char[]
		char temp[] = s1.toCharArray(); 
		
		for(int i=0; i<temp.length; i++) {
			System.out.print(temp[i] + ", ");
		}
		System.out.println();
		
		hr('-', 50);
		
		// str to byte[]
		byte temp2[] = s1.getBytes();

		for(int i=0; i<temp2.length; i++) {
			System.out.print(temp2[i] + ", ");
		}
		System.out.println();
		
		hr('-', 50);
		
		// toLowerCase()
		String s2 = s1.toLowerCase();
		System.out.println("s2: " + s2);
		
		hr('-', 50);
		
		// toUpperCase()
		String s3 = s1.toUpperCase();
		System.out.println("s3: " + s3);
		
		
	}

}
