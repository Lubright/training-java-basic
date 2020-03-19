package com.examples;

public class TwoDimensionArray {

	public static void main(String[] args) {
		
		int score[][]= {
				{1,7,15},
				{9,3,4},
				{6,8,13},
				{11,5,2},
				{10,7,9}
		};
		
		int sum1 = 0;
		
		for(int[] temp : score) {
			for(int val: temp) {
				sum1+=val;
			}
		}
		System.out.println("sum1 = " + sum1);
		
	}

}
