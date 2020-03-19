package com.examples;

public class TwoDimensionArray3 {

	public static void main(String[] args) {
		int[][] twoDimArr = new int[2][];
		
		twoDimArr[0] = new int[5];
		twoDimArr[1] = new int[5*2];
		
		for(int i=0; i<twoDimArr.length; i++) {
			System.out.printf("twoDimArr[%d].length = %d\n", i, twoDimArr[i].length);
		}
		
	}

}
