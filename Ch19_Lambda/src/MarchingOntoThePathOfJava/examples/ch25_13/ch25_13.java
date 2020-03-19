package MarchingOntoThePathOfJava.examples.ch25_13;

public class ch25_13 {

	static interface Message{
		Test getA(String msg);
	}
	
	static class Test{
		private String msg;
		
		public Test(String msg) {
			this.msg = msg;
			System.out.println("This is a constructor.");
		}
		
		@Override
		public String toString() {
			return "Test [msg=" + msg + "]";
		}
	}
	
	public static void main(String[] args) {
		Message obj = Test::new;
		
		Test t = obj.getA("a");
		
		System.out.println(t);

	}

}
