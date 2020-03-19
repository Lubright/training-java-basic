package examples;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ex2_PatternCompile1 {

	public static void main(String[] args) {
		String s1 = "0952-001-001";
		Pattern pattern = Pattern.compile("\\d{4}(-\\d{3}){2}");
		Matcher matcher = pattern.matcher(s1);
		
		System.out.println("result: " + matcher.matches());

	}

}
