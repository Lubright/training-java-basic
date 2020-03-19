package com.exercise.hw5;

class ThreadPrime implements Runnable{
	private int lowerBound;
	private int upperBound;
	private int counter;
	
	public ThreadPrime() {
		this.counter = 0;
	}
	public ThreadPrime(int lowerBound, int upperBound) {
		this.lowerBound = lowerBound;
		this.upperBound = upperBound;
		this.counter = 0;
	}

	@Override
	public void run() {
		for(int i=lowerBound; i<=upperBound; i++) {
			if(isPrime(i)) {
				System.out.println(i + ", ");
				this.counter+=1;
			}
		}
	}
	
	private static boolean isPrime(int n) {
		for(int i=2; i<n; i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
	
	public int getCounter() {
		return counter;
	}
	public void setCounter(int counter) {
		this.counter = counter;
	}
	
}

public class hw5_Prime1 {

	public static void main(String[] args) throws InterruptedException {
		ThreadPrime r1 = new ThreadPrime(2,10000);
		ThreadPrime r2 = new ThreadPrime(10001, 20000);
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		
		long startTime = System.currentTimeMillis();
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		System.out.println("all thread is finished.");
		System.out.println("2~10000 : " + r1.getCounter());
		System.out.println("10001~20000 : " + r2.getCounter());
		
		long stopTime = System.currentTimeMillis();
		long elapsedTime = stopTime - startTime;
		System.out.println("elapsedTime = " + elapsedTime + " ms");
		
	}

}
