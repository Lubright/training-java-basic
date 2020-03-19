package com.examples;

public class Function1 {
	// 定義常數
	final static double PI = 3.14;
	
	public static void main(String[] args) {

		System.out.println("Area(5) = " + Area(5));
		
	}
	
	protected static double Area(int r) {
		return r*r*Function1.PI;
	}

}
