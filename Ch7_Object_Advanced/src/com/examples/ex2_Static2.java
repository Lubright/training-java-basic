package com.examples;

public class ex2_Static2 {

	static String name = "Amy";
	int age;
	
	public String toString() {
		String result = "";
		
		result += String.format("name = %s", ex2_Static2.name);
		result += "\n";
		result += String.format("age = %d", this.age);
		
		return result;
	}
	
	public static void main(String[] args) {
		ex2_Static2 obj1 = new ex2_Static2();
		
		obj1.age = 20;
		System.out.println(obj1);

	}

}
