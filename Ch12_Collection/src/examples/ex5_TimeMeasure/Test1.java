package examples.ex5_TimeMeasure;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

public class Test1 {

	public static void main(String[] args) throws NoSuchAlgorithmException, UnsupportedEncodingException {
		
		
		String result = MyMD5Encrypt.encrypt("A");
		System.out.println("result = " + result);
		System.out.println("len = " + result.length());
		for(int i=0; i<result.length(); i++) {
			System.out.print(result.charAt(i));
		}
		System.out.println();
		
		
		
		
		
		
		
		byte temp1[] ="A".getBytes("UTF-8");
		String s1 = Base64.getEncoder().encodeToString(temp1);
		String result2 = new String(Base64.getDecoder().decode(result), "UTF-8");
		System.out.println("result2 = " + result2);
		for(int i=0; i<result2.length(); i++) {
			System.out.println((int)result2.charAt(i));
		}
		System.out.println();
	}

}
