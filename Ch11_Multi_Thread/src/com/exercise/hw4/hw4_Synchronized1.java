package com.exercise.hw4;

class PrePaid extends Thread{
	public static int sum = 200;
	
	public PrePaid() {
	}
	
	@Override
	public void run() {
		int fee = PrePaid.random(0, 99);
		
		if(PrePaid.sum >= 10) {
			System.out.println("run sum = " + PrePaid.sum);
			talk(fee);
		}
		
	}
	
	private void talk(int fee) {
		
		try {
			Thread.sleep(1000);
			PrePaid.sum -= fee; // 多個執行緒，同時執行
			System.out.println(Thread.currentThread().getName() + " fee = " + fee);
			System.out.println(Thread.currentThread().getName() + " sum = " + PrePaid.sum);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		

	}
	
	public static int random(int M, int N) {
	    int num;

	    num = (int)Math.floor( (Math.random()*(N-M+1) + M) );

	    return num;
	}
	
}

public class hw4_Synchronized1 {

	public static void main(String[] args) {
		PrePaid[] threadArr = new PrePaid[3];
		
		for(int i=0; i<threadArr.length; i++) {
			threadArr[i] = new PrePaid();
		}
		
		for(PrePaid t : threadArr) {
			t.start(); 
		}

	}

}
