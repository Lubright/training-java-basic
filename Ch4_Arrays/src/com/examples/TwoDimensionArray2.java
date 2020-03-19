package com.examples;

public class TwoDimensionArray2 {

	public static void main(String[] args) {
		int scores[][] = {
				{15, 48, 44, 11},
				{12, 78, 56, 49, 58},
				{55, 24, 31}
		};
		
		for(int i=0; i<scores.length; i++) {
			for(int j=0; j<scores[i].length; j++) {
				System.out.print(String.format("%d, ", scores[i][j]));
			}
			System.out.println();
		}

	}

}
