package com.examples;
import java.io.*;

public class ex2_Throws1 {

	public static void main(String[] args) {
		int a,b,result;
		
		try {
			a = 10;
			b = 0;
			result = calculate(a,b);
		}
		catch(ArithmeticException e) {
			System.out.println(e.toString());
		}
		catch(Exception e) {
			System.out.println(e.toString());
		}
		finally {
			System.out.println("run finally block...");
		}
		
		System.out.println("program ended...");
		
	}
	
	public static int calculate(int a, int b) throws ArithmeticException, Exception {
		// use throws 並不代表一定會拋出ArithmeticException
		return a/b;
	}
	public static int calculate2(int a, int b) throws Exception {
		// use throws 並不代表一定會拋出ArithmeticException
		return a/b;
	}
}
