package com.examples;

class Vehicle{
	private int wheel;
}

class Car2{
	Vehicle tmpVehicle;
	public Car2() {
		this.tmpVehicle = new Vehicle();
	}
	
	// overriding: finalize
	protected void finalize() {
		this.tmpVehicle = null; // release tmpVehicle
		System.out.println("¸ê·½¤wÄÀ©ñ");
	}
}

public class ex3_Finalize {

	public static void main(String[] args) {

		ex12_Car newCar = new ex12_Car(); // instance a car object
		newCar = null; // release newCar
		
		for(int i=0; i<10000000; i++) {
			new ex12_Car();
		}
		
	}

}
