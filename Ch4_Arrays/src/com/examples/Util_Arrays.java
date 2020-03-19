package com.examples;
import java.util.Arrays;
import java.util.Collections;


public class Util_Arrays {

	protected static void showArray(String name, int[] array)
	{
		for(int i=0; i<array.length; i++)
		{
			System.out.println(String.format("name[%d] = %d", i, array[i]));
		}
	}
	static void hr(char c, int n)
	{
		for(int i=0; i<n; i++)
		{
			System.out.print(c);
		}
		System.out.println();
	}
	
	public static void main(String[] args) {

		int list1[] = {3, 5, 1, 8, 9};
		
		// showArray
		showArray("list1", list1);
		
		hr('-', 50);
		
		// Arrays.sort
		Arrays.sort(list1);
		showArray("list1_sorted", list1);
		
	}

}
