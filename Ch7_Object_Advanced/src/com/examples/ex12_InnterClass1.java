package com.examples;

class ex12_Car{
	private boolean isRunning = false;
	private InnerEngine engine = new InnerEngine();
	
	private class InnerEngine{
		public void start() {
			System.out.println("Engine start...");
			isRunning = true; // access ex12_Car field
		}
	}
	
	public void start() {
		engine.start();
		System.out.println("Car start...");
	}
	
}

public class ex12_InnterClass1 {

	public static void main(String[] args) {
		ex12_Car car1 = new ex12_Car();
		
		car1.start();

	}

}
