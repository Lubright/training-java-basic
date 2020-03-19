package com.exercise.hw5;

public class hw5_Prime2_wo_Thread {

	public static void main(String[] args) throws InterruptedException {
		ThreadPrime r1 = new ThreadPrime(2,10000);
		ThreadPrime r2 = new ThreadPrime(10001, 20000);
		
		long startTime = System.currentTimeMillis();

		r1.run();
		r2.run();
		
		System.out.println("all thread is finished.");
		System.out.println("2~10000 : " + r1.getCounter());
		System.out.println("10001~20000 : " + r2.getCounter());
		
		long stopTime = System.currentTimeMillis();
		long elapsedTime = stopTime - startTime;
		System.out.println("elapsedTime = " + elapsedTime + " ms");
		
	}

}
