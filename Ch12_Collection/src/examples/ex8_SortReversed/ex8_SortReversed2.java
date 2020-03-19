package examples.ex8_SortReversed;

import java.util.Arrays;
import java.util.List;

public class ex8_SortReversed2 {

	public static void main(String[] args) {
		String[] arr = {"B", "X", "A", "M", "F", "W", "O"};
		List<String> list = Arrays.asList(arr);
		
		System.out.println("before sorted list: " + list);
		
		list.sort( (s1, s2) -> new String(s1).compareTo(s2) );
		list.sort( String::compareTo );
		list.sort( (s1, s2) -> -(new String(s1).compareTo(s2)) );
//		list.sort( -(String::compareTo) ); // error
		
		System.out.println("after sorted list: " + list);
		
	}

}
