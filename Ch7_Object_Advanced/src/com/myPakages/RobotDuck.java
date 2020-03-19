package com.myPakages;

public class RobotDuck extends Duck {

	public RobotDuck() {
		this.name = "robot_duck1";
		this.id = "1";
		this.flyBehavior = new FlyWithRocket();
		this.quackBehavior = new RobotQuack();
	}
	
	@Override
	public void display(){
		System.out.println("I'm " + name + ".");
	}

}
