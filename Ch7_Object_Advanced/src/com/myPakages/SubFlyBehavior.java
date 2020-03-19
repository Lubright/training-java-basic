package com.myPakages;

public abstract class SubFlyBehavior implements FlyBehavior {

	public abstract void fly();
	public void fly(String name){
		System.out.print(name);
		fly();
	}
	
	

}
