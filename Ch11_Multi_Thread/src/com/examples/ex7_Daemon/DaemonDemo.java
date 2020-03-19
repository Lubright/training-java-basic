package com.examples.ex7_Daemon;

public class DaemonDemo {

	public static void main(String[] args) {
		Thread thread = new Thread( ()->{
			for(int i = 0; i<100; i++) {
				System.out.println("test111");
			}
		} );
		
//		thread.setDaemon(true);
		thread.start();
		System.out.println(thread.isDaemon());

	}

}
