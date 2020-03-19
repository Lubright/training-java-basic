package com.examples.ex5_Bank1;

class Bank2{
	private static int sum = 0;
	
	public synchronized static void add(int n) {
		int temp = sum;
		temp += n;
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		sum = temp;
		System.out.println("sum = " + sum);
	}
	
}

class Customer2 extends Thread{
	
	@Override
	public void run() {
		// 將100元分三次匯入
		for(int i=0; i<3; i++) {
			Bank3.add(100);
		}
	}
	
	
	
}

public class ex5_Bank1_with_Sync {

	public static void main(String[] args) {
		Customer3 c1 = new Customer3();
		Customer3 c2 = new Customer3();
		
		c1.start();
		c2.start();

	}

}
