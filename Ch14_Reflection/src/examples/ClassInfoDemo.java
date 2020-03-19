package examples;

/*
 * 16.1.3 從 Class 中獲取資訊
 * 套件的對應型態是 java.lang.Package
 * 建構方法的對應型態是 java.lang.reflect.Constructor
 * 方法成員的對應型態是 java.lang.reflect.Method
 * 資料成員的對應型態是 java.lang.reflect.Field
 * 
 * */

public class ClassInfoDemo {

	public static void main(String[] args) {
		
		try {
			String className = "java.util.ArrayList";
			Class<?> c1 = Class.forName(className);
			Package c1_package = c1.getPackage();
			
			System.out.println("package name: " + c1_package.getName());
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}
