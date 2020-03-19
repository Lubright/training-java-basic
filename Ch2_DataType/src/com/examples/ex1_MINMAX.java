package com.examples;

public class ex1_MINMAX {

	public static void main(String[] args) {
		println("Integer.MIN_VALUE = " + Integer.MIN_VALUE);
		println("Integer.MAX_VALUE = " + Integer.MAX_VALUE);
		println("Short.MIN_VALUE = " + Short.MIN_VALUE);
		println("Short.MAX_VALUE = " + Short.MAX_VALUE);
		println("Byte.MIN_VALUE = " + Byte.MIN_VALUE);
		println("Byte.MAX_VALUE = " + Byte.MAX_VALUE);
		
		/* ------------- ex1_MINMAX output -------------
		   	Integer.MIN_VALUE = -2147483648
		   	Integer.MAX_VALUE = 2147483647
			Short.MIN_VALUE = -32768
			Short.MAX_VALUE = 32767
			Byte.MIN_VALUE = -128
			Byte.MAX_VALUE = 127
		 */
		
	}
	
	public static void println(String str){
		System.out.println(str);
	}

}
