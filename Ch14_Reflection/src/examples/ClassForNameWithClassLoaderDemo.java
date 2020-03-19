package examples;

/*
 * Using class Loader from ClassForNameWithClassLoaderDemo
 * ½d¨Ò 16.12 ForNameDemoV3.java
 * 
 * */

class A3{
	static {
		System.out.println("°õ¦æÀRºA°Ï¶ô...");
	}
	{
		System.out.println("°õ¦æ«DÀRºA°Ï¶ô...");
	}
	public A3() {
		System.out.println("public A3() is called...");
	}
}

public class ClassForNameWithClassLoaderDemo {

	public static void main(String[] args) {		
		
		
		try {
			System.out.println("load A3 Class with class loader");
			ClassLoader loader = ClassForNameWithClassLoaderDemo.class.getClassLoader();
			
			System.out.println("loader: " + loader);
			
			Class<?> c1 = loader.loadClass("examples.A3");
			
			System.out.println("Declare A3 class");
			A3 obj1 = null;
			
			System.out.println("Create A3 instance");
			obj1 = new A3();
			
			System.out.println("A3 class loader:" + obj1.getClass().getClassLoader());
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		

	}

}
