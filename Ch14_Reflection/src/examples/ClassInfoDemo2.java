package examples;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/*
 * 16.1.3 從 Class 中獲取資訊
 * 套件的對應型態是 java.lang.Package
 * 建構方法的對應型態是 java.lang.reflect.Constructor
 * 方法成員的對應型態是 java.lang.reflect.Method
 * 資料成員的對應型態是 java.lang.reflect.Field
 * 範例 16.10 SimpleClassViewer.java
 * 
 * */

public class ClassInfoDemo2 {

	public static void main(String[] args) {
		
		try {
			String className = "java.util.ArrayList"; // test class
			Class<?> c1 = Class.forName(className);
			Package p1 = c1.getPackage();
			
			System.out.printf("package name: %s\n", p1.getName());
			
			// get modifier, like public, final
			int modifier = c1.getModifiers();
			System.out.println("modifier int type: " + modifier);
			System.out.println("modifier string type: " + Modifier.toString(modifier));
			
			// isInterface
			if(Modifier.isInterface(modifier)) {
				System.out.println("interface");
			}
			else {
				System.out.println("class");
			}
			
			
			System.out.println("name: " + c1.getName());
			
			// get fields
			Field[] fields = c1.getDeclaredFields();
			
			for(int i=0; i<fields.length; i++) {
				System.out.printf("%d: %s %s %s\n", i, Modifier.toString(fields[i].getModifiers()), fields[i].getType().getName(), fields[i].getName());
			}
			System.out.printf("-------------------------------------------\n");
			
			// get constructor
			Constructor<?>[] contructors = c1.getDeclaredConstructors();
			
			for(int i=0; i<contructors.length; i++) {
				System.out.printf("%d: %s %s\n", i, Modifier.toString(contructors[i].getModifiers()), contructors[i].getName());
			}
			System.out.printf("-------------------------------------------\n");
			
			// get methods
			Method[] methods = c1.getDeclaredMethods();
			for(int i=0; i<methods.length; i++) {
				System.out.printf("%d: %s %s %s\n", i, Modifier.toString(methods[i].getModifiers()), methods[i].getReturnType().getName(), methods[i].getName());
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}
