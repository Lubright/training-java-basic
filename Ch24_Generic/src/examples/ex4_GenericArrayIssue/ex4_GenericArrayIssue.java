package examples.ex4_GenericArrayIssue;

import java.util.ArrayList;
import java.util.List;

public class ex4_GenericArrayIssue {

	public static void main(String[] args) {
		List<String>[] lists;
		lists = new List[10];
		
		lists[0] = new ArrayList<String>();
		lists[0].add("Justin");
		lists[0].add("Monica");
		lists[0].add("Irene");
		
		System.out.println("lists[0]: " + lists[0]);
	}

}
