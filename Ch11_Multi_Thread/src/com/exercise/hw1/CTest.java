package com.exercise.hw1;

class CTest extends Thread {
	private String id;
	public CTest() {
		
	}
	public CTest(String id) {
		super(id);
		this.id = id;
	}
	
	public void run() {
		System.out.println("Thread name: " + Thread.currentThread().getName());
		for(int i=1; i<=5; i++) {
			for(int j=0; j<10000000; j++);
//			System.out.println(Thread.currentThread().getName());
			System.out.println(id + " : " + i);
		}
	}
	
}
