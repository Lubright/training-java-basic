package examples;

public class ClassLoaderOfClassDemo {

	public static void main(String[] args) {
		// create instance
		ClassLoaderOfClassDemo obj1 = new ClassLoaderOfClassDemo();
		
		Class<?> c1 = obj1.getClass();
		
		// get classloader
		ClassLoader classLoader = c1.getClassLoader();
		System.out.println("ClassLoader: " + classLoader.toString());
		
		// get parent loader
		System.out.println("Parent ClassLoader: " + classLoader.getParent());

		// get parent loader
		System.out.println("Parent ClassLoader: " + classLoader.getParent().getParent());
		
		// get parent loader
//		System.out.println("Parent ClassLoader: " + classLoader.getParent().getParent().getParent());
	}

}

/*
ClassLoader: sun.misc.Launcher$AppClassLoader@73d16e93
Parent ClassLoader: sun.misc.Launcher$ExtClassLoader@15db9742
Parent ClassLoader: null
*/