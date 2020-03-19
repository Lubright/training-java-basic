package com.examples.ex10_Join;

public class ex10_JoinToMain {

	public static void main(String[] args) throws InterruptedException {
		System.out.println(Thread.currentThread().getName() + " is started...");

		Thread threadB = new Thread( ()->{
			System.out.println(Thread.currentThread().getName() + " is started...");
			
			for(int i=0; i<5; i++) {
				System.out.println("threadB is running");
			}
			
			System.out.println(Thread.currentThread().getName() + " is finished...");
		}, "threadB");
		
		threadB.start();
		threadB.join(); // join to main
		
		
		System.out.println(Thread.currentThread().getName() + " is finished...");
	}

}
