package com.exercise.hw4;

class ValueOutOfBoundsException extends ArrayIndexOutOfBoundsException{
	
}

class TestException{
	void test(int[] arr) throws ArrayIndexOutOfBoundsException{
		for(int val : arr){
			if(val > 100){
				throw new ValueOutOfBoundsException();
			}
			System.out.println(val);
		}
	}
}

public class hw4 {

	public static void main(String[] args) {
		try{
			new TestException().test(new int[]{150, 77, 44});
		}
		catch( ValueOutOfBoundsException e ){
			System.out.println(e.getClass());
		}

	}

}
