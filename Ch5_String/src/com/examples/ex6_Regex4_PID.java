package com.examples;
import java.util.Scanner;

public class ex6_Regex4_PID {
	
	static void showByteArr(byte[] arr)
	{
		for(int i=0; i<arr.length; i+=1)
		{
			System.out.println(i + ": " + arr[i]);
		}
		
	}
	
	// function: check user id
	static boolean checkPID(String input_str)
	{
		String pattern_pid = "[A-Za-z][1-9]{9}";
		int area_map[] = {10,11,12,13,14,15,16,17,34,18,19,20,21,22,35,23,24,25,26,27,28,29,32,30,31,33};
		byte[] input_byte_arr = input_str.toUpperCase().getBytes();
		int total_weight = 0;
		int checksum = 0; // ÀË¬d½X
		
		System.out.println("input_byte_arr:");
		showByteArr(input_byte_arr);
		
		if(input_str.matches(pattern_pid)) {
			
			// do other check
			int area_code = area_map[ input_byte_arr[0]-65 ];
			total_weight = (area_code/10) * 1 + (area_code%10) * 9;
			
			
			for(int i=1; i<input_byte_arr.length-1; i++)
			{
				total_weight+=((input_byte_arr[i]-48)*(9-i));
			}
			
			System.out.println("total_weight = " + total_weight);
			
			checksum = total_weight%10;
			
			checksum = (checksum==0)? 0:(10-checksum);
			
			System.out.println("checksum = " + checksum);
			
			return ((checksum)==(input_byte_arr[input_byte_arr.length-1]-48));
			
		}
		else {
			
			return false;
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your pid: ");
		String input_str = input.nextLine();
		
		if(checkPID(input_str)) {
			System.out.println("input_str: " + input_str + " matched pattern_pid.");
			
			
			
		}
		else {
			System.out.println(input_str + " does not matched pattern_pid.");
		}
		
		
		

	}

}
