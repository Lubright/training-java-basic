package com.examples;
import com.myPakages.*;

public class ex8_Test_Duck {

	public ex8_Test_Duck() {
		
	}
	
	static void hr(char c, int n)
	{
	    for(int i=0; i<n; i++)
	    {
	        System.out.print(c);
	    }
	    System.out.println();
	}


	public static void main(String[] args) {
		Duck robotDuck = new RobotDuck();
		
		robotDuck.display();
		robotDuck.performFly();
		robotDuck.performQuack();
		robotDuck.performSwim();
		
		hr('-', 50);
		
		robotDuck.setFlyBehavior(new FlyWithWings());
		robotDuck.performFly();
		robotDuck.setQuackBehavior(new Quack());
		robotDuck.performQuack();

	}

}
