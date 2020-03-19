package com.examples;

class MySuper{
	void fun1() {
		
	}
}

class MySub extends MySuper{
	@Override
	void fun1() {
		System.out.println("MySub fun1");
	}
}

interface MyInterface{
	void fun1();
}

class MyImp1 implements MyInterface{

	@Override
	public void fun1() {
		System.out.println("MyImp1 fun1");
		
	}
	
}

public class ex13_Anonymous_Class {
	// MySuper
	MySuper c1 = new MySub();
	MySuper c2 = new MySuper() { // use anonymous class

		@Override
		void fun1() {
			System.out.println("c2 fun1");
		}
		
	};
	
	// MyInterface
	MyInterface c3 = new MyImp1();
	MyInterface c4 = new MyInterface() { // use anonymous class

		@Override
		public void fun1() {
			System.out.println("c4 fun1");
			
		}
		
	};

	public static void main(String[] args) {
		ex13_Anonymous_Class obj = new ex13_Anonymous_Class();
		
		obj.c1.fun1();
		obj.c2.fun1();
		obj.c3.fun1();
		obj.c4.fun1();
		
	}

}
