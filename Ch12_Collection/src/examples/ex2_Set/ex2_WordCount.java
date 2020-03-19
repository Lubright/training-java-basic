package examples.ex2_Set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ex2_WordCount {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		
		System.out.print("Enter the content: ");
		Set<String> words = tokenize(console.nextLine());
		
		System.out.println(words);

	}
	
	static Set tokenize(String content) {
		String[] tokens = content.split(" ");
		HashSet<String> set = new HashSet<>(Arrays.asList(tokens));
		
		return set;
	}

}
