package com.examples.Polymorphism;

public class ex1_TestTV {

	public static void main(String[] args) {
		TV tv1 = new SonyTV();
		
		tv1.turnOn();
		((SonyTV) tv1).playDVD();
		((SonyTV) tv1).showSpecialSounds();
	}

}
