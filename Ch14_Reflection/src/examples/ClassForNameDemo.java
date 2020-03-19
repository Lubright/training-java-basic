package examples;

public class ClassForNameDemo {

	public static void main(String[] args) {
		String className = "java.util.Scanner"; // must be using fully qualified name
		try {
			Class<?> class1 = Class.forName(className);
			
			System.out.println("類別名稱: " + class1.getName());
			System.out.println("是否為介面: " + class1.isInterface());
			System.out.println("是否為基本型態: " + class1.isPrimitive());
			System.out.println("是否為陣列物件: " + class1.isArray());
			System.out.println("父類別名稱: " + class1.getSuperclass().getName());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		

	}

}
