package com.examples;

class CBasic2{
	protected String _name;
	protected int _age;
	
	public CBasic2() {
		this("basic", 1);
	}
	public CBasic2(String name, int age) {
		this._name = name;
		this._age = age;
	}
	
	public void showProperties() {

	}
	
}

class OuterClass{
	public void showOuterClass() {
		// use anonymous class to inherit CBasic class
		CBasic2 obj1 = new CBasic2("basic2", 2) { // start to declare anonymous class
			public String innerName;
			public int innerAge;
			public int id;
			
			// simulate constructor
			{
				this.innerName = super._name;
				this.innerAge = super._age;
				this.id = 5;
			}
			
			// overriding
			// feature: only original parent function could be called out of this class
			public void showProperties() {
				System.out.println("innerName: " + this.innerName); // basic2
				System.out.println("innerAge: " + this.innerAge); // 2
				this.showId(); // call new defined method
			}
			
			// new method
			public void showId() {
				System.out.println("id: " + this.id); // 5
			}
		};
		
		obj1.showProperties();
		// obj1.showId(); // error occurred
		
	}
}

public class ex6_Anonymous_Class2 {

	public static void main(String[] args) {
		
		new OuterClass().showOuterClass();

	}

}
