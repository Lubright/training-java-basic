package com.examples;

import java.util.Arrays;

public class Util_Arrays2 {

	public static void main(String[] args) {
		int arr1[] = {55, 24, 31, 98};
		int arr2[] = {55, 24, 31, 98};
		int arr3[] = {45, 2, 3, 88, 77};
		
		System.out.println("arr1和arr2內容是否相等: " + Arrays.equals(arr1, arr2));
		System.out.println("arr1和arr3內容是否相等: " + Arrays.equals(arr1, arr3));
		
	}

}
