package com.examples;

public class DefineArray2 {

	public static void main(String[] args) {
		// ªì©l¤Æ¤@ºû°}¦C
		int[] scores = {85, 99, 100};
		
		int i=0;
		for(int val : scores) {
			System.out.println(String.format("scores[%d] = %3d", i++, val));
		}

	}

}
