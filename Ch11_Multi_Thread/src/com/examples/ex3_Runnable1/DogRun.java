package com.examples.ex3_Runnable1;

public class DogRun implements RunBehavior {

	@Override
	public void run(String name) {
		for(int i=0; i<4; i++) {
			for(int j=0; j<1e8; j++); // do nothing, just use to slow down the program
			System.out.println(name + " dog is running...");
		}
	}

}
