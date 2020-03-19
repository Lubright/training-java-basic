package com.examples.ex3_Runnable1;

public abstract class Animal implements Runnable  {
	protected String name;
	protected RunBehavior runBehavior;
	
	public Animal() {
		
	}
	public Animal(String name) {
		this.name = name;
		this.runBehavior = null;
	}
	
	public void setRunBehavior(RunBehavior b) {
		this.runBehavior = b;
	}
	
	@Override
	public void run() {
		runBehavior.run(this.name);
	}
	
	public abstract void show();
	

}

class Dog extends Animal{
	public Dog() {
		this("dog1");
	}
	public Dog(String name) {
		super(name);
		runBehavior = new DogRun();
	}
	
	@Override
	public void show() {
		System.out.println("I'm a dog");
	}
}

class Cat extends Animal{
	public Cat() {
		this("cat1");
	}
	public Cat(String name) {
		super(name);
		runBehavior = new CatRun();
	}
	
	@Override
	public void show() {
		System.out.println("I'm a cat");
	}
}