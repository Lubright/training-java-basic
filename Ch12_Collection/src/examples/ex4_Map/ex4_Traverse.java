package examples.ex4_Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ex4_Traverse {
	
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
		Map<String, Integer> dict = new HashMap<>();
		
		dict.put("a", 1);
		dict.put("b", 2);
		dict.put("c", 3);
		
		System.out.println("dict: " + dict);
		
		Iterator<String> iter = dict.keySet().iterator();
		while(iter.hasNext()) {
			String key = iter.next();
			System.out.println(dict.get(key));
		}
		
		print_hr('-', 50);
		
		dict.values().forEach( value -> System.out.println(value) );

	}

}
