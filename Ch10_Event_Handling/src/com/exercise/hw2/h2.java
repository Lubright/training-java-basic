package com.exercise.hw2;

class IllegalAgeException extends IllegalArgumentException{
	
}

class TestAge{
	void test(int age) throws IllegalArgumentException{
		if(age < 20){
			throw new IllegalAgeException();
		}
		
		if(age >= 20 && age<=60){
			System.out.println("General Age");
		}
		else{
			System.out.println("Senior Age");
		}
	}
}

public class h2 {

	public static void main(String[] args) {
		int age = 12;

		try{
			new TestAge().test(age);
		}
		catch(Exception e){
			System.out.println(e.getClass());
		}
		
	}

}
