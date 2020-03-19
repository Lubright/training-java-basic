package com.examples;

public class BasicData {

	public static void main(String[] args) {
		int a = 1;
		long b = 2L;
		float c = 1.2f;
		double d = 1.5d;
		char e = 'C';
		boolean f = true;
		
		System.out.println(String.format("int a = %d, sizeof(int): %d, type(a) = %s", a, Integer.BYTES, "int"));
		System.out.println(String.format("long b = %d, sizeof(long): %d, type(a) = %s", b, Long.BYTES, "long"));
		System.out.println(String.format("float c = %f, sizeof(float): %d, type(a) = %s", c, Float.BYTES, "float"));
		System.out.println(String.format("double d = %f, sizeof(double): %d, type(a) = %s", d, Double.BYTES, "double"));
		System.out.println(String.format("char e = %c, sizeof(char): %d, type(a) = %s", e, Character.BYTES, "char"));
		System.out.println(String.format("boolean f = %b, type(a) = %s", f, 2, "boolean"));
		

	}

}
