package com.examples.Polymorphism;

public class SonyTV extends TV implements DVDable {
	public void showSpecialSounds() {
		System.out.println("SonyTV showSpecialSounds()");
	}

	@Override
	public void playDVD() {
		System.out.println("SonyTV playDVD()");
		
	}
}
