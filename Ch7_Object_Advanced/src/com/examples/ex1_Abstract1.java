package com.examples;

abstract class Animal{
	public int leg;
	
	Animal(){
		this.leg = 10;
	}
	
	abstract void showLeg(); // 子類別必須實作
}

class Dog extends Animal{
	Dog(){
		System.out.println("父類別的leg為: " + super.leg);
	}
	
	protected void showLeg() {
		System.out.println("實作了showLeg()");
	}
}

public class ex1_Abstract1 {

	public static void main(String[] args) {
		Dog d = new Dog();
		
		d.showLeg();
		

	}

}
