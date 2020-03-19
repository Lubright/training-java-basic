package examples.ex1_PathTest;

import java.nio.file.*;

public class ex1_PathTest {
	
	private static void pathFunctionTest(){
		System.out.println("=== pathFunctionTest() begin ===");
		Path path = Paths.get(System.getProperty("user.dir") + "/src/exmaples/ex1_PathTest/test_file1.txt");
		System.out.printf("getFileName: %s\n", path.getFileName());
		System.out.printf("getParent: %s\n", path.getParent());
		System.out.printf("getNameCount: %s\n", path.getNameCount());
		for (int i = 0; i < path.getNameCount(); i++) {
			System.out.println("Name element " + i + " is: " + path.getName(i));
		}
		System.out.printf("getRoot: %s\n", path.getRoot());
		System.out.printf("isAbsolute: %s\n", path.isAbsolute());
		System.out.printf("toAbsolutePath: %s\n", path.toAbsolutePath());
		System.out.printf("toURI: %s\n", path.toUri());
		System.out.println("=== pathFunctionTest() end ===");
	}
	
	private static void testNormalize(){
		System.out.println("=== testNormalize() begin ===");
		Path path1 = Paths.get("./src/exmaples/ex1_PathTest/test_file1.txt");
		System.out.println("before normalize: " + path1);
		System.out.printf("getRoot: %s\n", path1.getRoot());
		System.out.printf("isAbsolute: %s\n", path1.isAbsolute());
		path1 = path1.normalize();
		System.out.println("after normalize: " + path1);
		System.out.printf("getRoot: %s\n", path1.getRoot());
		System.out.printf("isAbsolute: %s\n", path1.isAbsolute());
		System.out.println("=== testNormalize() end ===");
	}

	public static void main(String[] args) {
		pathFunctionTest();
		
		testNormalize();
	}

}
