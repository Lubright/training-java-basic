package com.examples;

public class ex5_MultiArgs1 {
	
	public static double average(int... arr){
		int sum1 = 0;
		
		for(int v: arr){
			sum1 += v;
		}
		
		return (double) sum1 / arr.length;
	}

	public static void main(String[] args) {
		
		System.out.println(average(1,2,3));

	}

}
