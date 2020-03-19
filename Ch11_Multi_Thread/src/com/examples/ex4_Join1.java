package com.examples;

class CTest4 implements Runnable{
	protected String name;
	public CTest4() {
		
	}
	public CTest4(String name) {
		this.name = name;
	}
	
	@Override
	public void run() {
		for(int i=0; i<4; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(name + " is running...");
		}
		
	}
}

public class ex4_Join1 {

	public static void main(String[] args) {
		CTest4 dog1 = new CTest4("dog1");
		CTest4 cat1 = new CTest4("cat1");
		Thread t1 = new Thread(dog1, "dog1_thread");
		Thread t2 = new Thread(cat1, "cat1_thread");
		
		t1.start(); // enter runnable status
		
		try {
			t1.join(); // 限制t1執行緒結束後才能往下執行
			t2.start(); // enter runnable status
			t2.join(); // 限制t2執行緒結束後才能往下執行
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("main thread is finished...");
		

	}

}
