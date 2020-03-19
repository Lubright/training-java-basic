package com.examples;

public class For_each2 {

	public static void main(String[] args) {
		
		int A[][] = new int[2][3];
		int cnt = 0;
		
		for(int i=0; i<A.length; i++) {
			for(int j=0; j<A[i].length; j++) {
				cnt++;
				A[i][j]=cnt;
			}
		}
		
		System.out.println("A.length: " + A.length);
		System.out.println("A[0].length: " + A[0].length);
		
		// using for-each
		for(int temp[] : A)
		{
			for(int val : temp)
			{
				System.out.print(val + ", ");
			}
			System.out.println();
		}
		

	}

}
