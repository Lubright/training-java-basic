package examples;

public class GetLoaderInfo {

	public static void main(String[] args) {
		System.out.println("=== Bootstrap Loader ===");
		
		for(String path : System.getProperty("sun.boot.class.path").split(";")) {
			System.out.println(path);
		}
		System.out.println();
		
		System.out.println("=== Extended Loader ===");
		for(String path : System.getProperty("java.ext.dirs").split(";")) {
			System.out.println(path);
		}
		System.out.println();
		
		System.out.println("=== System Loader ===");
		for(String path : System.getProperty("java.class.path").split(";")) {
			System.out.println(path);
		}
		System.out.println();
	}

}

/*
=== Bootstrap Loader ===
C:\Program Files\Java\jdk1.8.0_221\jre\lib\resources.jar
C:\Program Files\Java\jdk1.8.0_221\jre\lib\rt.jar
C:\Program Files\Java\jdk1.8.0_221\jre\lib\sunrsasign.jar
C:\Program Files\Java\jdk1.8.0_221\jre\lib\jsse.jar
C:\Program Files\Java\jdk1.8.0_221\jre\lib\jce.jar
C:\Program Files\Java\jdk1.8.0_221\jre\lib\charsets.jar
C:\Program Files\Java\jdk1.8.0_221\jre\lib\jfr.jar
C:\Program Files\Java\jdk1.8.0_221\jre\classes

=== Extended Loader ===
C:\Program Files\Java\jdk1.8.0_221\jre\lib\ext
C:\WINDOWS\Sun\Java\lib\ext

=== System Loader ===
E:\Java\training-java-basic\Ch14_Reflection\bin
*/