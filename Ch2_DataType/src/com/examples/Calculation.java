package com.examples;

public class Calculation {
	// �w�q�`�ơA�N�J���O�[��
	final static float PI = 3.14f; // java default is double type, so need to assign float identifier
	public static void main(String[] args) {
		
		float r = 2f;
		float area = r*r*Calculation.PI;
		
		System.out.println(String.format("r = %.2f\narea = %.2f", r, area));

	}

}
