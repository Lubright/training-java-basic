package MarchingOntoThePathOfJava.examples.ch25_12;

public class ch25_12 {

	@FunctionalInterface
	static interface Message{
		public void msg();
	}
	
	static class A{
		public void fun1() {
			System.out.println("This isn't a static method.");
		}
	}
	
	public static void main(String[] args) {
		
		Message obj = new A()::fun1; // recommended
		Message obj2 = ()->new A().fun1();
		
		obj.msg();
		obj2.msg();
		
	}

}
