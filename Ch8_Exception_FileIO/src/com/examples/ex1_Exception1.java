package com.examples;
import java.io.*;

public class ex1_Exception1 {

	public static void main(String[] args) {
		
		int a = 100;
		int b = 0;
		int result;
		
		try {
			result= a / b;
			System.out.println("result = " + result);
		}
		catch(ArithmeticException e) {
			System.out.println("���Ƥ��o��0");
			System.out.println(e.toString());
		}
		catch(Exception e) {
			System.out.println(e.toString());
		}
		finally {
			System.out.println("run finally block...");
			System.exit(0); // ���槹��
		}
		
		System.out.println("program ended...");

	}

}
