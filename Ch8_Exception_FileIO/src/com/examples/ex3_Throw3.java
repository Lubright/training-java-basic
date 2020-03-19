package com.examples;
import java.io.*;

class MyException extends Exception{
	private int value;
	public MyException(int value) {
		this.value = value;
	}
	public String toString() {
		String result = "���{���L��\n" + 
						"���~�N�X��" + this.value + "\n" +
						"�гq�������H��\n";
		return result;
	}
}

public class ex3_Throw3 {

	public static void main(String[] args) {
		div1(10, 0);
		div1(10, 2);

	}

	public static void div1(int a, int b) {
		if(b==0) {
			try {
				throw new MyException(1); // �D�ʥ�X exception ����
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
