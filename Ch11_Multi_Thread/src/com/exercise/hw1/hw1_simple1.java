package com.exercise.hw1;

import com.exercise.hw1.CTest;

public class hw1_simple1 {

	public static void main(String[] args) {
		CTest hi = new CTest("Hello");
		CTest bye = new CTest("Good bye");
		
//		hi.run();
//		bye.run();
		
		hi.start();
		bye.start();
		
		System.out.println(Thread.currentThread().getName() + " is running...");
		
	}

}
