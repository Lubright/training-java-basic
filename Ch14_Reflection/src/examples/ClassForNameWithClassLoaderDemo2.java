package examples;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;

public class ClassForNameWithClassLoaderDemo2 {

	public static void main(String[] args) {		
		
		try {
			String classPath = "file:/d:/";
			String className = "examples.A3";
			
			URL url1 = new URL(classPath);
			URL url2 = new URL(classPath);
			
			// create class loader
			ClassLoader loader1 = new URLClassLoader(new URL[] {url1});
			ClassLoader loader2 = new URLClassLoader(new URL[] {url2});
			
			Class<?> c1 = loader1.loadClass(className);
			Class<?> c2 = loader2.loadClass(className);
			
			System.out.println("loader1: " + loader1);
			System.out.println("loader2: " + loader2);
			System.out.println(c1.getName());
			System.out.println(c2.getName());
			System.out.println("loader1==loader2 : " + (loader1==loader2));
			System.out.println("c1==c2 : " + (c1==c2));
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		finally {
			
		}

	}

}
