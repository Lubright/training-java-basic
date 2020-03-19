package com.examples;

// define CCircle class
class CCircle{
	protected double r; // private data member
	public static final double PI = 3.14; // public static final data
	
	// default constructor
	public CCircle() {
		this(0); // call the constructor CCircle(0)
		System.out.println("CCircle() is called.");
	}
	
	// define constructor
	public CCircle(double r) {
		this.r = r; // use this
	}
	
	// function: area
	public double area() {
		return Math.pow(this.r, 2) * CCircle.PI; // use static data member
	}
	
	// function: show
	public void show() {
		
		ex1_Constructor1.hr('-', 25); // use static function
		System.out.print(" CCircle ");
		ex1_Constructor1.hr('-', 25); // use static function
		System.out.println();
		
		System.out.println( String.format("r = %.2f", this.r) );
		System.out.println( String.format("area = %.2f", this.area()) );
		
	}
	
}


public class ex1_Constructor1 {

	public static void main(String[] args) {

		CCircle c1 = new CCircle(); // instance
		CCircle c2 = new CCircle(2); // instances

		c1.show();
		c2.show();
		
	}
	
	static void hr(char c, int n)
	{
		for(int i=0; i<n; i++)
		{
			System.out.print(c);
		}
	}
	
	
}
