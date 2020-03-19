package com.exercise.hw5;

public class hw5 {

	static void display(String arr[]){
		try{
			System.out.println(arr[3]);
		}
		catch(ArrayIndexOutOfBoundsException | NullPointerException e){
//			e = new Exception();
			throw e;
		}
	}
	
	public static void main(String[] args) {
		String arr[] = {"Java", "C++", "Null"};
		
		try {
			display(arr);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
