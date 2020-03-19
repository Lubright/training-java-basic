package com.examples;
import java.io.*;

class MyException extends Exception{
	private int value;
	public MyException(int value) {
		this.value = value;
	}
	public String toString() {
		String result = "本程式無效\n" + 
						"錯誤代碼為" + this.value + "\n" +
						"請通知相關人員\n";
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
				throw new MyException(1); // 主動丟出 exception 物件
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
