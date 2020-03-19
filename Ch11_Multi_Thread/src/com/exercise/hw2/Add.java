package com.exercise.hw2;

public class Add implements Runnable {
	private int n;
	private int sum = 0;
	public Add(int n) {
		this.n = n;
	}

	@Override
	public void run() {
		for(int i=1; i<=this.n; i++) {
			this.sum += i;
		}
		
	}
	
	public int getSum() {
		return this.sum;
	}

}
