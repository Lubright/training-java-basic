package com.examples;

public class Calculation {
	// 定義常數，代入類別觀念
	final static float PI = 3.14f; // java default is double type, so need to assign float identifier
	public static void main(String[] args) {
		
		float r = 2f;
		float area = r*r*Calculation.PI;
		
		System.out.println(String.format("r = %.2f\narea = %.2f", r, area));

	}

}
