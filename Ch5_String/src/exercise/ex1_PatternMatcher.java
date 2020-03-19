package exercise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ex1_PatternMatcher {
	
	static boolean isValidPhoneNumber(String input_str) {
		boolean result = false;
		Pattern pattern = Pattern.compile("(^\\d{4}-\\d{3}-\\d{3}|^\\d{4}\\d{3}\\d{3})");
		Matcher matcher = pattern.matcher(input_str);
		
		if(matcher.find()) {
			System.out.println("input_str: " + input_str + " is matched...");
			result = true;
		}
		else {
			result = false;
		}
		
		return result;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String input_str;
		
		System.out.print("Enter your phone number: ");
		input_str = input.nextLine();
		
		if(isValidPhoneNumber(input_str)) {
			System.out.println(input_str + " matched pattern_phone.");
		}
		else {
			System.out.println(input_str + " does not matched pattern_phone.");
		}

	}

}
