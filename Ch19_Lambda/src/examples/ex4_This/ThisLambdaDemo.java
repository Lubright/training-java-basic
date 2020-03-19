package examples.ex4_This;

public class ThisLambdaDemo {
	
	static class A{
		int a = 1;
		static int b = 2;
		Runnable r1 = ()->{
			System.out.println(this); // A class
		};
		
		Runnable r2 = () -> {
			System.out.println(toString()); // A class
		};
		
		@Override
		public String toString() {
			return "A class";
		}
	}

	public static void main(String[] args) {
		A a = new A();
		
		a.r1.run();
		a.r2.run();

	}

}
