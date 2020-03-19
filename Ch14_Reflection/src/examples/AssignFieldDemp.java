package examples;

import java.lang.reflect.Field;

/*
 * use new instance to manipulate object
 * ฝdจา 16.20 TestField.java
 * ฝdจา 16.21 AssignFieldDemo.java
 * 
 * */

class TestField{
	private int privateInt;
	public int publicInt;
	private String privateString;
	
	public String toString() {
		return String.format("privateInt = %d, publicInt = %d, privateString = %s, ", privateInt, publicInt, privateString);
	}
}

public class AssignFieldDemp {

	public static void main(String[] args) {
		try {
			Class<?> c = Class.forName("examples.TestField");
			Object obj = c.newInstance();
			
			Field privateInt = c.getDeclaredField("privateInt");
			privateInt.setAccessible(true);
			privateInt.setInt(obj, 99);
			
			Field publicInt = c.getDeclaredField("publicInt");
			publicInt.setInt(obj, 150);
			
			Field privateString = c.getDeclaredField("privateString");
			privateString.setAccessible(true);
			privateString.set(obj, "obj");
			
			System.out.println(obj);
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchFieldException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			
		}
	}

}
