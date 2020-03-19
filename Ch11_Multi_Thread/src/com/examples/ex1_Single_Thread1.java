package com.examples;

class CTest1{
	private String name;
	
	public CTest1(String name) {
		this.name = name;
	}
	
	public void run() {
		for(int i=0; i<4; i++) {
			for(int j=0; j<1e8; j++); // do nothing, just use to slow down the program
			System.out.println(name + " is running.");
		}
	}
	
}

public class ex1_Single_Thread1 {

	public static void main(String[] args) {
		
		CTest1 dog1 = new CTest1("dog1");
		CTest1 cat1 = new CTest1("cat1");
		
		dog1.run();
		cat1.run();
	}

}
