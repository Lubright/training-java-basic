package com.examples;

abstract class Shape{
	protected String name;
	protected String color;
	protected double area;
	
	// constructor
	public Shape() {
		this("shape","black");
	}
	public Shape(String name, String color) {
		this.setName(name);
		this.setColor(color);
	}
	
	// normal function
	public void setColor(String color) {
		this.color = color;
	}
	public void setName(String name) {
		this.name = name;
	}
	public static void hr(char c, int n)
	{
	    for(int i=0; i<n; i++)
	    {
	        System.out.print(c);
	    }
	    System.out.println();
	}
	
	// abstract function
	public abstract void show();
	public abstract void calArea();
}

class Circle extends Shape{
	protected double r;
	private final static double PI = 3.14;
	
	// constructor
	public Circle() {
		this("shape","black",0);
	}

	public Circle(String name, String color, double r) {
		super(name, color);
		this.r = r;
		this.calArea();
	}
	
	// getter
	public double getR() {
		return this.r;
	}
	public double getArea() {
		return this.area;
	}

	// setter
	public void setR(double r) {
		this.r = r;
	}
	
	@Override
	public void show() {
		System.out.println("name = " + name);
		System.out.println("color = " + color);
		System.out.println("r = " + r);
		System.out.println("area = " + area);
		Shape.hr('-', 50);
	}

	@Override
	public void calArea() {
		this.area = Math.pow(r, 2)*Circle.PI;
	}
}

class Rectangle extends Shape{
	protected double w;
	protected double h;

	// constructor
	public Rectangle() {
		this("shape","black",0,0);
	}

	public Rectangle(String name, String color, double w, double h) {
		super(name, color);
		this.w = w;
		this.h = h;
		this.calArea();
	}
	
	// getter
	public double getW() {
		return this.w;
	}
	public double getH() {
		return this.h;
	}
	public double getArea() {
		return this.area;
	}

	// setter
	public void setW(double w) {
		this.w = w;
	}
	public void setH(double h) {
		this.h = h;
	}
	
	@Override
	public void show() {
		System.out.println("name = " + name);
		System.out.println("color = " + color);
		System.out.println("w = " + w);
		System.out.println("h = " + h);
		System.out.println("area = " + area);
		Shape.hr('-', 50);
	}
	@Override
	public void calArea() {
		this.area = w*h;
	}
	
}

public class ex1_Abstract2 {

	public static void main(String[] args) {
		Shape c1 = new Circle("c1", "blue", 2); // upcasting
		Shape r2 = new Rectangle("r2", "red", 2, 5); // upcasting
		
		c1.show();
		r2.show();
	}

}
