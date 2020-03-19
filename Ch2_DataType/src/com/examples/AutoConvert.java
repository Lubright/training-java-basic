package com.examples;

public class AutoConvert {

	public static void main(String[] args) {
		int salary = 25000; // 定義 salary
		float tax = 0.06f; // 定義 tax
		double amount; // 定義 amount

		amount = salary * 12 * tax; // 由小轉大，自動轉換
		System.out.println("amount: " + amount);
		
	}

}
