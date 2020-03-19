package com.examples;

public class Loop1 {

	public static void main(String[] args) {
		int n = 11;
		int sum1 = 0;
		
		// using for
		for(int i=0; i<n; i++)
		{
			sum1+=i;
		}
		
		System.out.println("sum1 = " + sum1);

		// using while
		int i=0;
		sum1 = 0;
		while(i<n){
			sum1+=i;
			i++;
		}
		
		System.out.println("sum1 = " + sum1);
	}

}
