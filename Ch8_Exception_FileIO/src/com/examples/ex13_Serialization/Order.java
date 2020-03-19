package com.examples.ex13_Serialization;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order implements Serializable {
	private static final long serialVersionUID = 1L;
	private List<Shirt> shirts = new ArrayList<>();
	static int staticField = 100;
	transient int transientField = 145;
	
	public Order(Shirt ...shirts){
		for(Shirt shirt : shirts){
			this.shirts.add(shirt);
		}
		staticField = 99;
		transientField -= 1;
		System.out.println("--- Constructor is launched ---");
	}
	
	private void writeObject(ObjectOutputStream objectOutputStream) throws IOException{
		objectOutputStream.defaultWriteObject();
		Date now = new Date();
		objectOutputStream.writeObject(now);
		System.out.println("\nSerialized at: " + now + "\n");
	}
	
	// This method is called post-serialization
	private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException{
		System.out.println("Order.readObject is called...");
		objectInputStream.defaultReadObject();
		System.out.println("\nRestored from date: " + (Date)objectInputStream.readObject());
		System.out.println("Resotred at: " + new Date() + "\n");
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder("Order Summary ===\n");
		for (Shirt s : shirts) {
			sb.append(s);
		}
		sb.append("staticField = " + staticField);
		sb.append("\ntransientField = " + transientField);
		sb.append("\n------------------");
		return sb.toString();
	}
}
