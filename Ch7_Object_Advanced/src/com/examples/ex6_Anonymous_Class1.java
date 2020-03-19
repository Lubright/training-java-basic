package com.examples;

class CBasic{
	protected String _name;
	protected int _age;
	
	public CBasic() {
		this("basic", 1);
	}
	public CBasic(String name, int age) {
		this._name = name;
		this._age = age;
	}
	
	public void showProperties() {
		
	}
	
	
}


public class ex6_Anonymous_Class1 {

	public static void main(String[] args) {
		
		// use anonymous class to inherit CBasic class
		CBasic obj1 = new CBasic("basic2", 2) { // start to declare anonymous class
			public String innerName;
			public int innerAge;
			public boolean check;
			
			// simulate constructor
			{
				System.out.println("this._name: " + this._name); // basic2
				System.out.println("super._name: " + super._name); // basic2
				innerName = super._name;
				this.innerAge = super._age;
			}
			
			// overriding
			// feature: only original parent function could be called out of this class
			public void showProperties() {
				System.out.println("this.innerName: " + this.innerName); // basic2
				this.showAge(); // call new defined method
			}
			
			// new method
			public void showAge() {
				System.out.println("this.innerAge: " + this.innerAge); // 2
			}
			
		};
		
		obj1.showProperties();
		
		

	}

}
