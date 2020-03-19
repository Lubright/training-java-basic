package com.exercise;

class Guess{
	private int answer; // declare answer var
	
	static int random(int M, int N) {
	    int num;

	    num = (int)Math.floor( (Math.random()*(N-M+1) + M) );

	    return num;
	}
	
	// default constructor
	public Guess() {
		this(Guess.random(1,100));
	}
	
	// constructor
	public Guess(int answer) {
		this.answer = answer;
	}
	
	// function: getAnswer
	public int getAnswer() {
		return this.answer;
	}
	
	// function: judge
	public String judge(int answer) {
		
		if(answer == this.answer) {
			return "答對了";
		}
		else if(answer > this.answer) {
			return "太大了";
		}
		else {
			return "太小了";
		}
		
	}
	
}

public class HW61_Guess {

	public static void main(String[] args) {
		
		int input_num = Integer.parseInt(args[0]);
		Guess guess = new Guess();
		
		System.out.println("input_num: " + input_num);
		System.out.println("guess.answer: " + guess.getAnswer());
		System.out.println("judge: " + guess.judge(input_num));
		
		

	}

}
