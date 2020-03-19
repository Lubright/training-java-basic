package com.examples;

public class MathRandom1 {

	public static void main(String[] args) {
		
		for(int i=0; i<5; i++) {
			System.out.println( String.format("%d: %d", i, getPoint()) );
		}
		
		

	}
	
	static int random(int M, int N) {
		int num;
		
		num = (int)Math.floor( (Math.random()*(N-M+1) + M) );
		
		return num;
	}
	
	static int getPoint() {
		int point = random(1,5);
		
		return point;
	}

}
