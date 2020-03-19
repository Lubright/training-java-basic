package com.examples.ex13_Serialization;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class Shirt implements Serializable {
	
	private static final long serialVersionUID = 1L; // version id
	private String brand;
	private int quantity;
	private double cost;
	private transient double price;
	
	public Shirt(String brand, int quantity, double cost){
		this.brand = brand;
		this.quantity = quantity;
		this.cost = cost;
		this.price = cost*2;
	}
	
	// This method is called post-serialization
	private void readObject(ObjectInputStream in) throws ClassNotFoundException, IOException{
		System.out.println("Shirt.readObject is called...");
		in.defaultReadObject();
		
		this.price = this.cost + 50;
	}
	
	@Override
	public String toString() {
		StringBuffer content = new StringBuffer();
		
		content.append("Shirt: " + this.brand + "\n");
		content.append("Quantity: " + this.quantity + "\n");
		content.append("Cost: " + this.cost + "\n");
		content.append("Price: " + this.price + "\n");
		content.append("----------------------------\n");
		
		return content.toString();
	}
}
