package com.examples;

class NamedCircle extends CCircle{
	
	protected String name;
	
	public NamedCircle() {
		// System.out.println("NamedCircle() is called.");
		// auto call super()
	}
	public NamedCircle(String name) {
		this.name = name;
		// auto call super()
	}
	public NamedCircle(double r, String name) {
		super(r); // call CCircle(double r)
		this.name = name;
	}
	
	// overriding
	public void show() {
		ex1_Constructor1.hr('-', 25); // use static function
		System.out.print(" NamedCircle ");
		ex1_Constructor1.hr('-', 25); // use static function
		System.out.println();
		
		System.out.println( String.format("name = %s", this.name) );
		System.out.println( String.format("r = %.2f", this.r) );
		System.out.println( String.format("area = %.2f", this.area()) );
		
		
	}
	
	
}

public class ex3_Extends {

	public static void main(String[] args) {
		
		NamedCircle c1 = new NamedCircle(2, "c1");
		
		c1.show();

	}

}
