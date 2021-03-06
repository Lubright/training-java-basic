package examples;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ex3_StringSearch1 {

	public static void main(String[] args) {
		String s1 = "Please call my secretary using 0930-919-919 or 0952-001-001";
		Pattern pattern = Pattern.compile("\\d{4}(-\\d{3}){2}");
		Matcher matcher = pattern.matcher(s1);
		
		boolean found = false;
		
		while(matcher.find()) {
			System.out.println(matcher.group() + " is started at " + matcher.start() + " and ended at " + matcher.end());
			found = true;
		}
		
		if(!found) {
			System.out.println("Not found!");
		}
		
	}

}
