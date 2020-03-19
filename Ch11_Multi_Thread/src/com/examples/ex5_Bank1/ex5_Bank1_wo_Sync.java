package com.examples.ex5_Bank1;

class Bank{
	private static int sum = 0; // static var 
	public static void add(int n) {
		int temp = sum;
		temp += n; // 累加
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		sum = temp;
		System.out.println("sum = " + sum);
	}
	
	
}

class Customer extends Thread{
	
	@Override
	public void run() {
		// 將100元分三次匯入
		for(int i=0; i<3; i++) {
			Bank.add(100);
		}
	}
	
	
	
}

public class ex5_Bank1_wo_Sync {

	public static void main(String[] args) {
		Customer c1 = new Customer();
		Customer c2 = new Customer();
		
		c1.start();
		c2.start();

	}

}
