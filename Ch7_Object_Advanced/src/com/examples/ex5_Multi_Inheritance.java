package com.examples;

interface RunAction{
	public void run();
}

interface FlyAction{
	public void fly();
}

interface SwimAction{
	public void swim();
}

// AllActions interface
interface AllActions extends RunAction, FlyAction, SwimAction{
	
}

// abstract class
abstract class SuperAnimal implements AllActions {
	
}

class SuperDuck extends SuperAnimal{
	
	protected String name;
	
	// constructor
	public SuperDuck() {
		this("duck");
	}
	
	// constructor
	public SuperDuck(String name) {
		this.name = name;
	}
	
	// overriding
	public void run() {
		System.out.println(this.name + " can run...");
	}

	// overriding
	public void fly() {
		System.out.println(this.name + " can fly...");
	}

	// overriding
	public void swim() {
		System.out.println(this.name + " can swim...");
	}
	
	
}

public class ex5_Multi_Inheritance {

	public static void main(String[] args) {
		SuperDuck duck = new SuperDuck();
		
		duck.run();
		duck.fly();
		duck.swim();
		
	}

}
