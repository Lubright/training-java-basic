package examples;

public class SystemPropertysDemo {

	public static void main(String[] args) {
		System.out.println(System.getProperties());
		
		for(String s1 : System.getProperties().toString().split(", ")) {
			System.out.println(s1);
		}

	}

}
