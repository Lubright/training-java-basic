package com.examples;

public class Explicit_Convert {

	public static void main(String[] args) {
		int amount, salary = 12000; // �w�q amount, salary
		double tax = 0.06; // �w�q tax

		amount = (int) (salary * 12 * tax);
		System.out.println("amount: " + amount);

	}

}
