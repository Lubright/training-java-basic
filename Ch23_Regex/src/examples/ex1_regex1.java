package examples;

public class ex1_regex1 {

	public static void main(String[] args) {
		String pattern = "\\w+((na)|(ra))\\w+";
		String s1 = "dfldksfdljkfnadsfjlk";
		String s2 = "dfldksfdljkfradsfjlk";
		String s3 = "dfldksfdljkfradnasfjlk";
		String s4 = "dfldksfdljkfsdfdsfjlk";
		
		System.out.println("s1: " + s1.matches(pattern));
		System.out.println("s2: " + s2.matches(pattern));
		System.out.println("s3: " + s3.matches(pattern));
		System.out.println("s4: " + s4.matches(pattern));
	}

}
