package examples;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;

/*
 * use new instance to manipulate object
 * �d�� 16.15 Student.java
 * �d�� 16.16 NewInstanceDemo2.java
 * 
 * */

class Student{
	private String name;
	private int score;
	
	public Student() {
		name = "";
	}
	public Student(String name, int score) {
		this.name = name;
		this.score = score;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	public String getName() {
		return name;
	}
	public int getScore() {
		return score;
	}
	
	public String toString() {
		return name + ": " + score;
	}
	
}

public class NewInstanceDemo2 {

	public static void main(String[] args) {
		
		try {
			Class<?> Student = Class.forName("examples.Student");
			
			// ���w�Ѽƫ��A
			Class<?> param1 = String.class;
			Class<?> param2 = int.class;
			
			// get constructor
			Constructor<?> constructor = Student.getConstructor(new Class<?>[] {param1, param2});
			
			System.out.println("constructor name: " + Modifier.toString(constructor.getModifiers()) + " " +constructor.getName());
			
			// ���w�ѼƤ��e
			Object[] argForContructor = new Object[2];
			argForContructor[0] = "Amy";
			argForContructor[1] = 95;
			
			Object student1 = constructor.newInstance(argForContructor);
			
			System.out.println(student1);
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		finally {
			
		}

	}

}
