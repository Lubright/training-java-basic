package examples.ex4_This;

public class ThisDemo {
	
	static class A{
		int a = 1;
		static int b = 2;
		
		Runnable r1 = new Runnable() {
			@Override
			public void run() {
				System.out.println(this.getClass().getName()); // inner r1 class
			}
		};
		
		Runnable r2 = new Runnable() {
			@Override
			public void run() {
				System.out.println(toString()); // inner r2 class
			}
			
			@Override
			public String toString() {
				return "r2 class";
			}
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
