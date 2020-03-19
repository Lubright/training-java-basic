package examples;

public class ClassForNameDemo {

	public static void main(String[] args) {
		String className = "java.util.Scanner"; // must be using fully qualified name
		try {
			Class<?> class1 = Class.forName(className);
			
			System.out.println("���O�W��: " + class1.getName());
			System.out.println("�O�_������: " + class1.isInterface());
			System.out.println("�O�_���򥻫��A: " + class1.isPrimitive());
			System.out.println("�O�_���}�C����: " + class1.isArray());
			System.out.println("�����O�W��: " + class1.getSuperclass().getName());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		

	}

}
