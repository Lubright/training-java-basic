package com.examples;
import java.io.*;

public class ex3_Throw2 {

	public static void main(String[] args) {
		try {
			div1(10, 1);
			div1(10, 0);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void div1(int a, int b) throws Exception {
		if(b==0) {
			throw new Exception("Divided by 0!!!"); // use throws to handle
		}
		else {
			System.out.println("result = " + (a/b) );
		}
	}

}
