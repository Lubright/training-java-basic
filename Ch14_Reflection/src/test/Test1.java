package test;

public class Test1 {
	
	public static void get(Double value) {
		System.out.println(value.getClass().getSimpleName());
	}
	
	public static void set(int site, Object value) {
		System.out.println(value.getClass().getSimpleName());
		get(new Double(value.toString()));
	}

	public static void main(String[] args) {
		int a = 1;
		set(1, a);

	}

}
