package examples;

import java.lang.reflect.Array;

/*
 * use new instance to manipulate array object
 * 範例 16.24 NewArrayDemo2.java
 * 
 * */

public class NewArrayDemo2 {
	
	public static void main(String[] args) {
		Class<?> c = String.class; // ready for creating string array
		
		// 打算建立一個3*4陣列
		Object arr1 = Array.newInstance(c, new int[] {3, 4}); // create 3x4 array
		
		int m=3, n=4;
		for(int i=0; i<m; i++) {
			Object row = Array.get(arr1, i);
			for(int j=0; j<n; j++) {
				Array.set(row, j, (i+1)*(j+1)+"");
			}
		}
	
		// show two dimension array
		for(int i=0; i<m ; i++) {
			Object row = Array.get(arr1, i);
			for(int j=0; j<n; j++) {
				System.out.print(Array.get(row, j)+ ", ");
			}
			System.out.println();
		}
		
	}

}
