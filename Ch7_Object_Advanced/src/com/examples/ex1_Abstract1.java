package com.examples;

abstract class Animal{
	public int leg;
	
	Animal(){
		this.leg = 10;
	}
	
	abstract void showLeg(); // �l���O������@
}

class Dog extends Animal{
	Dog(){
		System.out.println("�����O��leg��: " + super.leg);
	}
	
	protected void showLeg() {
		System.out.println("��@�FshowLeg()");
	}
}

public class ex1_Abstract1 {

	public static void main(String[] args) {
		Dog d = new Dog();
		
		d.showLeg();
		

	}

}
