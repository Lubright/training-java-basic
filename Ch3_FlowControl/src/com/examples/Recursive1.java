package com.examples;

public class Recursive1 {

	static int factorial(int n) {
		
		if(n==0 || n==1)
			return n;
		
		return n*factorial(n-1);
		
	}
	
	public static void main(String[] args) {
		
		System.out.println("factorial(5) = " + factorial(5));

	}

}
