package com.examples;
import java.io.*;

public class ex3_Throw1 {

	public static void main(String[] args) {
		
		div1(10, 1);
		div1(10, 0);
		
	}
	
	public static void div1(int a, int b) {
		if(b==0) {
			try {
				throw new Exception("Divided by 0!!!"); // �D�ʥ�X exception ����
			}
			catch(Exception e) {
				System.out.println(e.toString());
			}
		}
		else {
			System.out.println("result = " + (a/b) );
		}
	}

}
