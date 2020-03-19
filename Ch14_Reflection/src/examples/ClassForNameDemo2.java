package examples;

/*
 * static block only do once when class is loaded (using new to create instance) or Class loader
 * non static block do when class is initiated before constructor
 * 
 */

class A2{
	static {
		System.out.println("�����R�A�϶�...");
	}
	{
		System.out.println("����D�R�A�϶�...");
	}
	public A2() {
		System.out.println("public A2() is called...");
	}
}

public class ClassForNameDemo2 {

	public static void main(String[] args) {
		
		try {
			System.out.println("load A2 Class");
			Class<?> class1 = Class.forName("examples.A2");
			
			System.out.println("Declare A2 class");
			A2 obj1 = null;
			
			System.out.println("create obj1");
			obj1 = new A2();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		

	}

}
