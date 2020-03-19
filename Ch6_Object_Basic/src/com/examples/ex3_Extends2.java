package com.examples;

public class ex3_Extends2 {

	public static void main(String[] args) {

		A a1 = new A();
		
		System.out.println("a1.w = " + a1.w + ", a1.h = " + a1.h); // a1.w = 10, a1.h = 10
		
		B b1 = new B();
		System.out.println("b1.w = " + b1.w + ", b1.h = " + b1.h); // b1.w = 20, b1.h = 20
		
		// 父類別存取子類別的物件
		A b2 = new B(); // 隱含了自動轉型
		System.out.println("b2.w = " + b2.w + ", b2.h = " + b2.h); // b2.w = 10, b2.h = 10
		// System.out.println("b2.name = " + b2.name); // error, 此時為父類別的物件
		
		B b3 = (B)b2; // 強制轉型
		System.out.println("b3.w = " + b3.w + ", b3.h = " + b3.h); // b3.w = 20, b3.h = 20
		System.out.println("b3.name = " + b3.name); // b3.name = B
		
	}

}

class A{
	protected int w = 10;
	protected int h = 10;
}

class B extends A{
	protected int w = 20;
	protected int h = 20;
	public String name = "B";
}
