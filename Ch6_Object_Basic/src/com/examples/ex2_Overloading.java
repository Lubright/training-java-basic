package com.examples;

class Calculate{
	
	protected int add(int a, int b) {
		return (a+b);
	}
	
	// overloading: add
	public double add(double a, double b) {
		return (a+b);
	}
	
	// overloading: add
	public int add(int a, int b, int c) {
		return this.add(this.add(a, b), c);
	}
	
}

public class ex2_Overloading {

	public static void main(String[] args) {

		Calculate obj1 = new Calculate();
		
		System.out.println("add(1,2): " + obj1.add(1, 2));
		System.out.println("add(1,2, 3): " + obj1.add(1, 2, 3));
		System.out.println("add(1.5,2.4): " + obj1.add(1.5, 2.4));
		
	}

}
