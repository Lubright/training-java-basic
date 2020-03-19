package com.examples.ex10_Join;

public class ex10_JoinToOther {

	public static void main(String[] args) throws InterruptedException {
		System.out.println(Thread.currentThread().getName() + " is started...");

		Thread threadA = new Thread( ()->{
			System.out.println(Thread.currentThread().getName() + " is started...");
			for(int i=0; i<5; i++) {
				System.out.println("threadA is running");
			}
			System.out.println(Thread.currentThread().getName() + " is finished...");
		}, "threadA");
		
		Thread threadB = new Thread( ()->{
			System.out.println(Thread.currentThread().getName() + " is started...");
			for(int i=0; i<5; i++) {
				System.out.println("threadB is running");
			}
			System.out.println(Thread.currentThread().getName() + " is finished...");
		}, "threadB");
		
		threadA.start();
		threadA.join();
		threadB.start();
		
		System.out.println(Thread.currentThread().getName() + " is finished...");
	}

}
