package com.examples.AnonymousArray;

public class AnonymousArrayDemo {

	public static void main(String[] args) {
		System.out.println(add(new int[] {1, 2, 3}));

	}
	
	public static int add(int... arr) {
		int result = 0;
		for(int o : arr) {
			result+=o;
		}
		return result;
	}

}
