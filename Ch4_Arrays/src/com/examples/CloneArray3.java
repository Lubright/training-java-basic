package com.examples;

public class CloneArray3 {

	public static void main(String[] args) {
		int scores[] = {98, 99, 100};
		int scores2[] = new int[scores.length]; // �ŧiscores2�}�C�A������l��
		
		System.arraycopy(scores, 0, scores2, 0, scores.length);
		
		// show scores array
		for(int val: scores2) {
			System.out.print(val+", ");
		}
		System.out.println();
		
	}

}
