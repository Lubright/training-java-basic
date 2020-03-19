package examples.ex2_Set;

import java.util.HashSet;
import java.util.Iterator;

public class ex2_HashSet1 {

	public static void main(String[] args) {
		
		// create a HashSet object
		HashSet<String> set1 = new HashSet<String>();

		set1.add("Monkey");
		set1.add("Bunny");
		set1.add("Bunny");
		set1.add("Kitty");
		
		System.out.println("set1 = " + set1);
		
		// size
		System.out.println("size = " + set1.size());
		
		// isEmpty
		System.out.println("isEmpty : " + set1.isEmpty());
		
		// contains
		System.out.println("contains Bunny : " + set1.contains("Bunny"));
		
		// iterator 1
		for(String o : set1) {
			System.out.println(o);
		}
		
		// iterator 2
		Iterator<String> iter1 = set1.iterator();
		while(iter1.hasNext()) {
			String temp = iter1.next();
			System.out.println(temp);
		}
		
		// remove
		set1.remove("Bunny");
		System.out.println("set1 = " + set1);
		
		// clear
		set1.clear();
		System.out.println("size = " + set1.size());
	}

}
