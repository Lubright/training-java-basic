package com.examples.ex5_Bank1;

import java.util.ArrayList;
import java.util.ArrayList;

class Bank3{
	private static int sum = 0;
	private static ArrayList<Integer> tempSum = new ArrayList<Integer>();
	
	public static void add(int n) {
		int temp = sum;
		ArrayList<Integer> temp2 = tempSum;
		temp += n;
		temp2.add(n);
		
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		sum = temp;
		tempSum = temp2;
		System.out.println("sum = " + sum);
		System.out.println("tempSum = " + tempSum.size());
	}
	
}

class Customer3 extends Thread{
	
	@Override
	public void run() {
		// 將100元分三次匯入
		for(int i=0; i<10; i++) {
			Bank3.add(100);
		}
	}
	
	
	
}

public class ex5_Bank1_with_Sync2 {

	public static void main(String[] args) {
		Customer3 c1 = new Customer3();
		Customer3 c2 = new Customer3();
		
		c1.start();
		c2.start();

	}

}
