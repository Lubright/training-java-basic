package com.examples.ex6_Timer;

import java.util.Timer;
import java.util.TimerTask;

public class ex6_Timer1 {
	
	Timer myTimer;
	
	public ex6_Timer1() {
		// 建立Timer物件
		myTimer = new Timer();
		// 建立Task物件
		Task1 myTask1 = new Task1();
		Task2 myTask2 = new Task2();
		
		// schedule myTask1
		myTimer.schedule(myTask1, 1000, 1000);
		myTimer.schedule(myTask2, 2000, 2000);
	}

	public static void main(String[] args) {
		System.out.println("ex6_Timer1 start");
		new ex6_Timer1();
	}
	
	class Task1 extends TimerTask{
		int counter = 1;
		
		@Override
		public void run() {
			if(counter <= 3) {
				System.out.println("Task1");
				System.out.printf("counter = %d\n", counter);
				counter++;
			}
			else {
				System.out.println("counter > 3, then cancel");
				this.cancel(); // quit task
			}
			
		}
		
	}
	
	class Task2 extends TimerTask{
		int counter = 10;
		
		
		@Override
		public void run() {
			if(counter >= 6) {
				System.out.println("Task2");
				System.out.printf("counter = %d\n", counter);
				counter--;
			}
			else {
				System.out.println("counter < 6, then cancel");
				myTimer.cancel(); // use myTimer to quick schedule
			}
		}
		
	}
	

}
