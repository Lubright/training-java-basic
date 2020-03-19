package examples.ex1_SimpleDemo;

import java.util.Arrays;
import java.util.Comparator;

public class ex1_SimpleDemo {
	
    public static String hr(char c, int n)
    {
        StringBuffer content = new StringBuffer();
        for(int i=0; i<n; i++)
        {
            content.append(c);
        }
        return content.toString();
    }

    static void print_hr(char c, int n)
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
			"Catepilla"
		};
		
		String[] names2 = Arrays.copyOf(names, names.length);
		
		// way1
		Comparator<String> byLength = new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				
				return o1.length() - o2.length();
			}
			
		};
		
		System.out.println("before sort: ");
		showArr(names);
		Arrays.sort(names, byLength);
		System.out.println("after sort: ");
		showArr(names);
		print_hr('-', 50);
		
		// way2
		System.out.println("before sort: ");
		showArr(names2);
		Arrays.sort(names2, (name1, name2) ->{
			return name1.length() - name2.length();
		} );
		System.out.println("after sort: ");
		showArr(names);
		print_hr('-', 50);
		
	}
	
	public static void showArr(String[] arr) {
		for(String o : arr) {
			System.out.print(o + ", ");
		}
		System.out.println();
	}

}
