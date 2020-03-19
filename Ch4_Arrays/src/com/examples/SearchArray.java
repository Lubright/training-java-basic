package com.examples;
import java.util.*;

// http://tw.gitbook.net/java/util/arrays_binarysearch_int.html

public class SearchArray {
	
	protected static void showArray(String name, char[] array)
	{
		for(int i=0; i<array.length; i++)
		{
			System.out.println(String.format("name[%d] = %c", i, array[i]));
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
		
		char SearchArray[] = {'A', 'C', 'X', 'W', 'E'};
		
		showArray("before_sort", SearchArray);
		hr('-', 50);
		
		// using the Arrays.binarySearch, it needs to sort first
		Arrays.sort(SearchArray);
		
		showArray("sorted", SearchArray);
		hr('-', 50);
		
		// do binarySearch
		int index = Arrays.binarySearch(SearchArray, 'C');
		System.out.println("index = " + index + "; searched = " + SearchArray[index]);

	}

}
