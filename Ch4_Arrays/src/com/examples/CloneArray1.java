package com.examples;
import java.lang.System;
import java.util.Arrays;

public class CloneArray1 {

	public static void main(String[] args) {
		int scores[] = {98, 99, 100};
		int scores2[] = null;
		
		scores2 = scores; // reference to the same memory
		
		// modify the scores2
		scores2[1] = 95;
		System.out.println("scores[1] = " + scores[1]); // scores[1] = 95
		System.out.println("scores2[1] = " + scores2[1]); // scores2[1] = 95
		
		// hashCode
		System.out.println("scores.hashCode: " + scores.hashCode()); // show the hashCode
		System.out.println("scores2.hashCode: " + scores2.hashCode()); 
		
		for(int i=0; i<50; i++) System.out.print('-');
		System.out.println();
		
		// equals
		int scores3[] = scores.clone(); // copy array
		System.out.println("scores.hashCode: " + scores.hashCode()); // show the hashCode
		System.out.println("scores2.hashCode: " + scores2.hashCode()); 
		System.out.println("scores3.hashCode: " + scores3.hashCode());
		
		System.out.println("scores.equals(scores2): " + scores.equals(scores2)); // true
		System.out.println("scores.equals(scores3): " + scores.equals(scores3)); // false
		
		// using Arrays.equals to compare each array content
		System.out.println("Arrays.equals(scores, scores2): " + Arrays.equals(scores, scores2)); // true
		System.out.println("Arrays.equals(scores, scores3): " + Arrays.equals(scores, scores3)); // true
		
	}

}
