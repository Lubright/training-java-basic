package com.exercise;
import java.io.*;

public class HW82_InputStreamReader {

	public static void main(String[] args) throws IOException {
		
		String name, gender;
		int age;
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		
		
		System.out.print("Enter your name > ");
		name = buf.readLine();
		
		System.out.print("Enter your age > ");
		age = Integer.parseInt(buf.readLine());
		
		System.out.print("Enter your gender > ");
		gender = buf.readLine();
		
		// -------------------------------------------------------------------------
	    hr('-', 50);
	    
	    System.out.println("name: " + name);
	    System.out.println("age" + age);
	    System.out.println("gender: " + gender);
		

	}
	
	static void hr(char c, int n)
	{
	    for(int i=0; i<n; i++)
	    {
	        System.out.print(c);
	    }
	    System.out.println();
	}

}
