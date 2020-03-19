package com.examples.ex9_SleepInterrupt;

public class ex9_SleepInterrupt {

	public static void main(String[] args) {
		
		Thread thread = new Thread( new Runnable() {

			@Override
			public void run() {
				
				try {
					Thread.sleep(10000);
				} catch (InterruptedException e) {
					System.out.println("I am interrupted...");
					e.printStackTrace();
				}
				
			}
			
		});
		
		thread.start();
		thread.interrupt();

	}

}
