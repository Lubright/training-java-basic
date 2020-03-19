package com.examples;


// define interface
interface Actions{
	// interface 裡面全部會具有public, abstract的特性
	public String name = "Actions";
	public void fly();
	public void run();	
}

class Bird implements Actions{
	protected String name;
	
	public Bird() {
		this("bird");
	}
	public Bird(String name) {
		this.name = name;
	}
	
	public void fly() {
		System.out.println(this.name + " is flying...");
	}
	
	public void run() {
		// 沒有但還是要寫...
	}
}

class Plane implements Actions{
	protected String name;
	protected int price;
	
	public Plane() {
		this("plane", 100);
	}
	public Plane(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public void fly() {
		System.out.println(this.name + " is flying...");
	}
	
	public void run() {
		// 沒有但還是要寫...
	}
	
	
}

public class ex4_Interface1 {

	public static void main(String[] args) {
		Bird b1 = new Bird();
		
		b1.fly();
		System.out.println(b1.name);
		
		Actions a1 = new Plane();
		a1.fly();
		System.out.println(a1.name); // Actions
		// System.out.println(a1.price); // error occurred
		
		Plane a2 = (Plane)a1; // 強制轉型
		System.out.println(a2.name);
		
	}

}
