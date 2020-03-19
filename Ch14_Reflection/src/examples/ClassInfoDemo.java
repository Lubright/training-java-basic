package examples;

/*
 * 16.1.3 �q Class �������T
 * �M�󪺹������A�O java.lang.Package
 * �غc��k���������A�O java.lang.reflect.Constructor
 * ��k�������������A�O java.lang.reflect.Method
 * ��Ʀ������������A�O java.lang.reflect.Field
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
