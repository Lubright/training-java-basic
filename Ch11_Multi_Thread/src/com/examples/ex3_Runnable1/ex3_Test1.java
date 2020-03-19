package com.examples.ex3_Runnable1;

public class ex3_Test1 {

	public static void main(String[] args) {
		Animal dog1 = new Dog();
		Animal cat1 = new Cat();
		
		Thread t1 = new Thread(dog1, "dog1");
		Thread t2 = new Thread(cat1, "cat1");
		
//		dog1.setRunBehavior(new CatRun());
		
		t1.start();
		t2.start();
//		dog1.setRunBehavior(new CatRun());
		System.out.println("main thread is finished...");
	}

}
