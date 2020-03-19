package com.examples;

public class StringArray1 {

	static void hr(char c, int n)
	{
		for(int i=0; i<n; i++)
		{
			System.out.print(c);
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		String arr[] = {"A", "B", "C"};
		
		for(String val: arr) {
			System.out.print(val+", ");
		}
		System.out.println();
		
		// -------------------------------------------------------------------------
		hr('-', 50);
		
		// A[1] = A[2]
		arr[1] = arr[2]; // 值相等，記憶體位置不同
		
		for(String val: arr) {
			System.out.print(val+", ");
		}
		System.out.println();
		
		System.out.println("arr[1].haseCode = " + arr[1].hashCode());
		System.out.println("arr[2].haseCode = " + arr[2].hashCode());
		System.out.println("arr[1] == A[2]" + arr[1] == arr[2]);
		
		// -------------------------------------------------------------------------
		// modify arr[1]
		arr[1] = "D";
		hr('-', 50);
		
		for(String val: arr) {
			System.out.print(val+", ");
		}
		System.out.println();

	}

}
