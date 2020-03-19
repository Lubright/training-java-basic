package com.exercise.hw1;

public class hw1 {

	public static void main(String[] args) {
		String arr[] = {"SE", "ee", "ME"};
		
		for(String var : arr){
			try{
				switch(var){
				case "SE":
					System.out.println("Standard Edition");
					break;
				case "EE":
					System.out.println("Enterprise Edition");
					break;
				case "ME":
					System.out.println("Micro Edition");
					break;
				default:
						assert false;
				}
			}
			catch(Error e){
				System.out.println("catch block...");
				System.out.println(e.getClass());
			}
		}

	}

}
