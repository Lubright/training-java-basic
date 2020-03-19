package MarchingOntoThePathOfJava.examples.ch25_10;

public class ch25_10 {

	@FunctionalInterface
	static interface Message{
		public void msg();
	}
	
	static class A{
		public static void fun1() {
			System.out.println("This is a static method");
		}
	}
	
	public static void main(String[] args) {
		Message obj = A::fun1; // recommended
		Message obj2 = ()->A.fun1();
		
		obj.msg();
		obj2.msg();
		

	}

}
