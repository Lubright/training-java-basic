package com.examples;

class Car{
	public static String name;
	public int wheel;
}

public class ex2_Static {

	public static void main(String[] args) {
		Car.name = "Honda"; // �]�� name�]�O static �ܼ�
		// Car.wheel = 10; // error occurred
	}

}
