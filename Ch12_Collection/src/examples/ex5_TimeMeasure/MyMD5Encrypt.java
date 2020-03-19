package examples.ex5_TimeMeasure;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

/*
 * 
 * 
 * 
 * reference:
 * 			1. https://blog.gtwang.org/programming/python-md5-sha-hash-functions-tutorial-examples/
 * 			2. https://magiclen.org/java-base64/
 * 			3. https://taurus770423.pixnet.net/blog/post/392461750-%5Bjava%5D-hashcode-sha-256
 */

public class MyMD5Encrypt {
	
	public static String encrypt(String data) throws NoSuchAlgorithmException {
		byte[] ciphers;
		MessageDigest md = MessageDigest.getInstance("MD5");
		md.reset();
		md.update(data.getBytes());
		ciphers = md.digest();
		
		return Base64.getEncoder().encodeToString(ciphers);
	}

}
