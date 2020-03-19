package examples.ex2_MethodReference;

import java.util.Arrays;

public class ex2_MethodReference {
	
	public static String hr(char c, int n)
    {
        StringBuffer content = new StringBuffer();
        for(int i=0; i<n; i++)
        {
            content.append(c);
        }
        return content.toString();
    }

	public static void print_hr(char c, int n)
    {
        for(int i=0; i<n; i++)
        {
            System.out.print(c);
        }
        System.out.println();
    }

	public static void main(String[] args) {
		String[] names = {
			"Justin",
			"Amy",
			"Caterpillar"
		};
		
		System.out.println("before sort: ");
		showArr(names);
//		Arrays.sort(names, (s1, s2)->ex2_MethodReference.byLexicography(s1, s2)); // way1
		Arrays.sort(names, (s1, s2) -> new ex2_MethodReference().byLexicography(s1, s2)); // method reference
		System.out.println("after sort: ");
		showArr(names);
		print_hr('-', 50);
		
		String[] names2 = {
				"Justin",
				"Amy",
				"Caterpillar"
			};
			
		System.out.println("before sort: ");
		showArr(names2);
		Arrays.sort(names2, ex2_MethodReference::byLength); // way2
		System.out.println("after sort: ");
		showArr(names2);
		print_hr('-', 50);
	}
	
	public static int byLength(String s1, String s2) {
		return s1.length() - s2.length();
	}
	public static int byLexicography(String s1, String s2) {
		return s1.compareTo(s2);
	}
	
	public static void showArr(String[] arr) {
		for(String o : arr) {
			System.out.print(o + ", ");
		}
		System.out.println();
	}

}
