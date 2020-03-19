package examples;

import java.util.List;

/*
 * use new instance to manipulate object
 * ฝdจา 16.14 NewInstanceDemo.java
 * 
 * */

public class NewInstanceDemo {

	public static void main(String[] args) {
		try {
			String className = "java.util.ArrayList";
			Class<?> c1 = Class.forName(className);
			List<String> list = (List) c1.newInstance();
			
			for(int i=0; i<5; i++) {
				list.add("element " + i);
			}
			for(String s1 : list) {
				System.out.println(s1);
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		finally {
			
		}

	}

}
