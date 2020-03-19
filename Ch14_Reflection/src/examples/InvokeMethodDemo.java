package examples;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/*
 * use new instance to manipulate object
 * 範例 16.15 Student.java
 * 範例 16.17 InvokeMethodDemo.java
 * 
 * */

public class InvokeMethodDemo {

	public static void main(String[] args) {
		try {
			Class<?> StudentClass = Class.forName("examples.Student");
			
			// 使用default constructor
//			Object student1 = StudentClass.newInstance();
			Constructor<?> defaultConstructor = StudentClass.getConstructor();
			System.out.println("defaultConstructor: " + Modifier.toString(defaultConstructor.getModifiers()) + " " + defaultConstructor.getName());
			
			Object student1 = defaultConstructor.newInstance();
			
			// 設定參數型態
			Class<?>[] param1_String = {String.class};
//			Class<?>[] param2_Integer = {Integer.class}; // error occurred
//			Class<?>[] param2_Integer = {Integer.TYPE};
			Class<?>[] param2_Integer = {int.class};
			
			Method setName = StudentClass.getMethod("setName", param1_String);
			// call setName method
			setName.invoke(student1, new Object[] {"Amy"});
			
			Method setScore = StudentClass.getDeclaredMethod("setScore", param2_Integer); // use getDeclaredMethod
			setScore.invoke(student1, new Object[] {new Integer(95)});
			
			System.out.println("setScore: ");
			for(Class<?> c : setScore.getParameterTypes()) {
				System.out.println(c.getName());
			}
			System.out.println(student1);
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			
		}

	}

}
