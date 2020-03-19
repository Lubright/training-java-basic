package com.examples;

public class ex2_Binary_Hex {

	public static void main(String[] args) {
		
		long a_hex = 0xffffffffL; // java default 認為是 int，所以要故意在後面加上 "L"
		long b_bin = 0b1111;
		
		System.out.println("a_hex = " + a_hex);
		System.out.println("a_hex = 0x" + Long.toHexString(a_hex));
		System.out.println("b_bin = " + b_bin);
		System.out.println("b_bin = 0b" + Long.toBinaryString(b_bin));

	}

}
