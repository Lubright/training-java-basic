package examples.ex2_Set;

import java.util.*;

public class ex2_LinkedHashSet1 {

	public static void main(String[] args) {
		Set<String> set1 = new LinkedHashSet<String> ();
		
		set1.add("Monkey");
		set1.add("Bunny");
		set1.add("Bunny");
		set1.add("Kitty");
		
		System.out.println("set1 = " + set1);

	}

}
