package examples;

public class ClassDemo {

	public static void main(String[] args) {
		String s1 = "test111";
		Class<?> s1_class = s1.getClass(); // use object to get class
		
		System.out.println("���O�W��: " + s1_class.getName());
		System.out.println("�O�_������: " + s1_class.isInterface());
		System.out.println("�O�_���򥻫��A: " + s1_class.isPrimitive());
		System.out.println("�O�_���}�C����: " + s1_class.isArray());
		System.out.println("�����O�W��: " + s1_class.getSuperclass().getName());
		
		System.out.println("-------------------------------------------------");
		
		Class<?> stringClass = String.class; // use class to get class
		System.out.println("���O�W��: " + stringClass.getName());
		System.out.println("�O�_������: " + stringClass.isInterface());
		System.out.println("�O�_���򥻫��A: " + stringClass.isPrimitive());
		System.out.println("�O�_���}�C����: " + stringClass.isArray());
		System.out.println("�����O�W��: " + stringClass.getSuperclass().getName());
	}

}
