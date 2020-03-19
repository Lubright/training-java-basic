package examples;

public class ClassDemo {

	public static void main(String[] args) {
		String s1 = "test111";
		Class<?> s1_class = s1.getClass(); // use object to get class
		
		System.out.println("類別名稱: " + s1_class.getName());
		System.out.println("是否為介面: " + s1_class.isInterface());
		System.out.println("是否為基本型態: " + s1_class.isPrimitive());
		System.out.println("是否為陣列物件: " + s1_class.isArray());
		System.out.println("父類別名稱: " + s1_class.getSuperclass().getName());
		
		System.out.println("-------------------------------------------------");
		
		Class<?> stringClass = String.class; // use class to get class
		System.out.println("類別名稱: " + stringClass.getName());
		System.out.println("是否為介面: " + stringClass.isInterface());
		System.out.println("是否為基本型態: " + stringClass.isPrimitive());
		System.out.println("是否為陣列物件: " + stringClass.isArray());
		System.out.println("父類別名稱: " + stringClass.getSuperclass().getName());
	}

}
