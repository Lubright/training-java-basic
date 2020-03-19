package com.examples;

class CTest3 extends Thread{
	
	private String name;
	
	public CTest3() {
		
	}
	public CTest3(String name) {
		this.name = name;
	}
	

	@Override
	public void run() {
		
		for(int i=0; i<4; i++) {
			try {
//				Thread.sleep((int)Math.random()*1000);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(name + " is running...");
		}
		
	}
	
}

public class ex3_Sleep1 {

	public static void main(String[] args) {
		CTest3 dog1 = new CTest3("dog1");
		CTest3 cat1 = new CTest3("cat1");
		
		dog1.start();
		cat1.start();
		System.out.println("main thread is finished...");
	}

}
