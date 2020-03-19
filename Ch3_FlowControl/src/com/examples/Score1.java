package com.examples;
import java.util.Scanner;

public class Score1 {

	public static void main(String[] args) {
		Scanner inputObj = new Scanner(System.in); // 定義 Scanner obj
		int score;
		
		System.out.print("Enter the score: ");
		score = inputObj.nextInt();
		
		if(score>=90){
			System.out.println("score = " + score + ", rank = A");
		}
		else if(score>=80){
			System.out.println("score = " + score + ", rank = B");
		}
		else if(score>=70){
			System.out.println("score = " + score + ", rank = C");
		}
		else if(score>=60){
			System.out.println("score = " + score + ", rank = D");
		}
		else{
			System.out.println("score = " + score + ", rank = E");
		}
		
		System.out.println("程式執行完畢!!!");
		
		
		
		

	}

}
