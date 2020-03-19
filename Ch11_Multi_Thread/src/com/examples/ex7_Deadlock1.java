package com.examples;

public class ex7_Deadlock1 {

	public static void main(String[] args) {
		Object o1 = new Object(); // create a some object
		Object o2 = new Object(); // create a some object
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				String threadName = Thread.currentThread().getName();
				synchronized(o1) {
					System.out.println("This is in a " + threadName + " and get an o1");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					// this block o1 do not be released
					System.out.println(threadName + " wait an o2");
					synchronized(o2) {
						System.out.println("This is in a " + threadName + " and get an o2");
					}
				}
				// o1 will be released
				
			}
			
		}, "t1");
		
		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				String threadName = Thread.currentThread().getName();
				synchronized(o2) {
					System.out.println("This is in a " + threadName + " and get an o2");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println(threadName + " wait an o1");
					synchronized(o1) {
						System.out.println("This is in a " + threadName + " and get an o1");
					}
				}

				
			}
			
		}, "t2");
		
		t1.start();
		t2.start();
		

	}

}
