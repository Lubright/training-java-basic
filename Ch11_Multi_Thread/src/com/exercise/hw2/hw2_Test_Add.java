package com.exercise.hw2;

public class hw2_Test_Add {

	public static void main(String[] args) throws InterruptedException {
		
		Add r1 = new Add(5);
		Add r2 = new Add(10);
		
		Thread t1 = new Thread(r1, "t1");
		Thread t2 = new Thread(r2, "t2");
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		System.out.println("all thread is finished.");
		
		System.out.println("sum1 = " + r1.getSum());
		System.out.println("sum2 = " + r2.getSum());
	}

}
