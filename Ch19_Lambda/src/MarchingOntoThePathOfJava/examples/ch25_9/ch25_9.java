package MarchingOntoThePathOfJava.examples.ch25_9;

import java.util.Arrays;
import java.util.List;

// forEach

public class ch25_9 {

	public static void main(String[] args) {
		List<String> list = Arrays.asList(
			"a",
			"b",
			"c"				
		);
		
		list.forEach(System.out::println);
		
		list.forEach((data)->{
			System.out.printf(data + ", ");
		});

	}

}
