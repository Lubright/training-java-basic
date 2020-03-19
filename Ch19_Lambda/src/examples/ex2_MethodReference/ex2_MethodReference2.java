package examples.ex2_MethodReference;

import java.util.Arrays;

public class ex2_MethodReference2 {
	
	// ---------- static method begin ---------- //
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
	
	public static void showArr(String[] arr) {
		for(String o : arr) {
			System.out.print(o + ", ");
		}
		System.out.println();
	}
	// ---------- static method end ---------- //
	
	// ---------- static class begin ---------- //
	static class StringOrder{
		public static int byLength(String s1, String s2) {
			return s1.length() - s2.length();
		}
		
		public int reversedByLength(String s1, String s2) {
			return -(s1.length() - s2.length());
		}
	}
	// ---------- static class end ---------- //
	
	public static StringOrder so = new StringOrder();
	
	public static void main(String[] args) {
		String[] arr = {
			"Justin",
			"Irene",
			"Amy",
			"Caterpillar"
		};
		
		System.out.println("before sort: ");
		showArr(arr);
		
		Arrays.sort(arr, StringOrder::byLength); // static method reference
		
		System.out.println("after sort: ");
		showArr(arr);
		print_hr('-', 50);
		
		String[] arr2 = {
				"Justin",
				"Irene",
				"Amy",
				"Caterpillar"
		};

		System.out.println("before sort: ");
		showArr(arr2);

		Arrays.sort(arr2, (s1, s2) -> new StringOrder().reversedByLength(s1, s2)); // method reference

		System.out.println("after sort: ");
		showArr(arr2);
		print_hr('-', 50);
		
		String[] arr3 = {
				"Justin",
				"Irene",
				"Amy",
				"Caterpillar"
		};

		System.out.println("before sort: ");
		showArr(arr3);

		Arrays.sort(arr3, so::reversedByLength); // method reference

		System.out.println("after sort: ");
		showArr(arr3);
		print_hr('-', 50);
		
		String[] arr4 = {
				"Justin",
				"Irene",
				"Amy",
				"Caterpillar"
		};

		System.out.println("before sort: ");
		showArr(arr4);

		Arrays.sort(arr4, new StringOrder()::reversedByLength); // method reference

		System.out.println("after sort: ");
		showArr(arr4);
	}

}
