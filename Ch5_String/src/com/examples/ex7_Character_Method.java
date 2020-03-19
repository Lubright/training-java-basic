package com.examples;

public class ex7_Character_Method {

	public static void main(String[] args) {
		char c1 = 'c';
		char c2 = 'A';
		char d1 = '1';
		
		System.out.println("Character.isLowerCase(c1): " + Character.isLowerCase(c1));
		System.out.println("Character.isDigit(d1): " + Character.isDigit(d1));
		System.out.println("Character.digit(c2, 16): 0x" + Character.digit(c2, 16));
		
	}

}
