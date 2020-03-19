package examples;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ex4_ScaleConversion {

	static class StringToNumber{
		public static boolean DEV_MODE = false;
		
		public static void setDebugMode() {
			DEV_MODE = true;
		}
		public static double parse(String inputStr) {
			double result = 0;
			String scale = null;
			inputStr = inputStr.trim();
			Pattern pattern = Pattern.compile("(\\d+\\.?\\d{0,})\\s{0,}(m|u|n)\\w?");
			Matcher matcher = pattern.matcher(inputStr);
			
			if(matcher.find()) {
				if(DEV_MODE) {
					System.out.print("number: " + matcher.group(1));
					System.out.println(" scale: " + matcher.group(2));
				}
				
				result = Double.parseDouble(matcher.group(1));
				scale = matcher.group(2);
				switch(scale) {
				case "m":
					result *= 1e-3;
					break;
				case "u":
					result *= 1e-6;
					break;
				case "n":
					result *= 1e-9;
					break;
				default:
					break;
				}

			}
			
			
			return result;
		}
		
		
	}
	
	public static void main(String[] args) {
		double val = StringToNumber.parse("12mA");
		
		System.out.println(String.format("val = %g", val));
		
		double[] arr = {10e-3,20e-3,30e-3};
		double target=0;
		for(double v : arr) {
			if(val<v) {
				target = v;
				break;
			}
		}
		System.out.println(String.format("target = %g", target));
		

	}

}
