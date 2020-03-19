package com.exercise.hw3;

class CTest implements Runnable{

	private String name;
	private double waitTime;
	private int loopTimes;
	
	// constructor
	public CTest() {
	}
	public CTest(String name, double waitTime, int loopTimes) {
		this.name = name;
		this.waitTime = waitTime;
		this.loopTimes = loopTimes;
	}

	@Override
	public void run() {
		for(int i=0; i<this.loopTimes; i++) {
			try {
				Thread.sleep((int)waitTime*1000); // ms -> s
				System.out.println(name + " is running...");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}

public class hw3_Thread1 {

	public static void main(String[] args) {
		Runnable r1 = new CTest("Thread 1", 1, 10);
		Runnable r2 = new CTest("Thread 2", 2.5, 10);
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		
		t1.start();
		t2.start();
		System.out.println(Thread.currentThread().getName() + " is running...");
	}

}
