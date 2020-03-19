package com.examples;

interface IA{
	public void fun1();
}

class CA implements IA{
	public void fun1() {
		System.out.println("CA fun1...");
	}
}

class CB extends CA implements IA{
	public void fun1() {
		System.out.println("CB fun1...");
	}
}


public class ex5_Multi_Inheritance2 {

	public static void main(String[] args) {
		
		CA a = new CA();
		CB b = new CB();
		IA a2 = new CA();
		IA b2 = new CB();
		CA b3 = new CB();
		
		a.fun1(); // CA fun1...
		b.fun1(); // CB fun1...
		a2.fun1(); // CA fun1...
		b2.fun1(); // CB fun1...
		b3.fun1(); // CB fun1...
		
	}

}
