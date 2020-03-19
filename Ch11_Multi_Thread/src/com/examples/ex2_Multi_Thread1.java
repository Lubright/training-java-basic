package com.examples;

class CTest2 extends Thread{
	
	private String name;
	
	public CTest2(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		for(int i=0; i<4; i++) {
			for(int j=0; j<1e8; j++); // do nothing, just use to slow down the program
			System.out.println(name + " is running.");
		}
	}
	
	
	
}

public class ex2_Multi_Thread1 {

	public static void main(String[] args) {
		CTest2 dog1 = new CTest2("dog1");
		CTest2 cat1 = new CTest2("cat1");
		
		dog1.start(); // use start not run
		cat1.start(); // use start not run

	}

}
