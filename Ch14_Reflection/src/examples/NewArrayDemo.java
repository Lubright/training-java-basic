package examples;

import java.lang.reflect.Array;

/*
 * use new instance to manipulate array object
 * ฝdจา 16.23 NewArrayDemo.java
 * 
 * */

public class NewArrayDemo {
	
	public static void main(String[] args) {
		Class<?> c = String.class;
		Object objArr = Array.newInstance(c, 5); // use Object to catch array object
		
		for(int i=0; i<5; i++) {
			Array.set(objArr, i, String.valueOf((char)(97+i)) );
		}
		for(int i=0; i<5; i++) {
			System.out.println(i + ": " + Array.get(objArr, i));
		}
		System.out.println();
		
		String[] arr1 = (String[]) objArr;
		for(String s1 : arr1) {
			System.out.println(s1);
		}
		
	}

}
