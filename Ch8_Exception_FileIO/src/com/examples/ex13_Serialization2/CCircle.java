package com.examples.ex13_Serialization2;

import java.io.Serializable;

public class CCircle implements Serializable {

	public static final double PI = 3.14;
	private String name;
	private double r;
	
	public CCircle() {
		this("", 0);
	}
	public CCircle(String name, double r) {
		this.name = name;
		this.r = r;
	}
	
	public String getName() {
		return name;
	}
	public double getR() {
		return r;
	}
	
	public double area() {
		return Math.pow(this.r, 2) * PI;
	}
	
	public String toString() {
		StringBuffer content = new StringBuffer();
		
		content.append("---------- " + this.getClass().getName() + " ----------\n");
		content.append( String.format("name = %s, r = %.2f, area = %.2f\n", this.name, this.r, area()) );
		
		return content.toString();
	}

}
