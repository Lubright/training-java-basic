package com.myPakages;
import com.myPakages.*;

public abstract class Duck {
	
	public String name;
	public String id;
	SubFlyBehavior flyBehavior;
	QuackBehavior quackBehavior;
	
	public Duck(){
		
	}
	
	
	public void performSwim(){
		this.swim();
	}
	public void performFly(){
		flyBehavior.fly(this.name);
	}
	
	public void performQuack(){
		quackBehavior.quack();
	}
	
	public abstract void display();
	
	
	private void swim() {
		System.out.println("swim.");

	}
	
	public void setFlyBehavior(SubFlyBehavior f){
		this.flyBehavior = f;
	}
	
	public void setQuackBehavior(QuackBehavior q){
		this.quackBehavior = q;
	}

}
