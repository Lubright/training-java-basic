package com.examples;

public class ex5_StringBuffer1 {

	public static void main(String[] args) {
		StringBuffer s1 = new StringBuffer("test123"); // 使用 String 建立 StringBuffer 物件
		
		System.out.println("s1: " + s1);
		
		// hashCode()
		System.out.println("s1.hashCode(): " + s1.hashCode());

		// capacity()
		System.out.println("s1.capacity(): " + s1.capacity());
		
		// length()
		System.out.println("s1.length(): " + s1.length());
		
		// append()
		s1.append("_abc");
		System.out.println("s1: " + s1);
		System.out.println("s1.hashCode(): " + s1.hashCode());
		
		// reverse()
		s1.reverse();
		System.out.println("s1: " + s1);
		System.out.println("s1.hashCode(): " + s1.hashCode());
		
		// delete()
		s1.delete(0, 4);
		System.out.println("s1: " + s1);
		
	}

}
