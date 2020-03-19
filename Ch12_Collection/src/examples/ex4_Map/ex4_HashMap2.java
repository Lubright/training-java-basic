package examples.ex4_Map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class ex4_HashMap2 {
	
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
		Map<String, String> dict1 = new HashMap<>();
		
		dict1.put("a", "1");
		dict1.put("c", "3");
		dict1.put("b", "2");
		
		System.out.println("dict1: " + dict1);
		
		print_hr('-', 50);
		TreeMap<String, String> treeMap = new TreeMap<>( (s1, s2) -> -(s1.compareTo(s2)) );
		
		treeMap.put("a","1");
		treeMap.put("b","2");
		treeMap.put("c","3");
		
		System.out.println("treeMap: " + treeMap);
		
		

	}

}
