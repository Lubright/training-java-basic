package examples.ex8_SortReversed;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ex8_SortReversed {

	public static void main(String[] args) {
		String[] arr = {"B", "X", "A", "M", "F", "W", "O"};
		List<String> list = Arrays.asList(arr);
		
		System.out.println("before sorted list: " + list);
		
		Collections.sort(list, (s1, s2) -> {
			return -s1.compareTo(s2);
		} );
		
		System.out.println("after sorted list: " + list);

	}

}
