package examples.ex3_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ex4_ListAndArrayList {

	public static void main(String[] args) {
		System.out.println("----- Create a unchangeable list (tuple): personTuple -----");
		// Create tuple
		List<Person> personTuple = Arrays.asList(
			new Person("Amy"),
			new Person("Justin"),
			new Person("Irene")
		);
		
//		personTuple.add(new Person("Monica")); // error occurred, it is a tuple
		
		print_hr('-', 50);
		
		System.out.println("----- Create a changeable list: personList -----");
		// Create list
//		ArrayList<Person> personList = (ArrayList<Person>) personTuple; // error occurred
		List<Person> personList = new ArrayList<>( Arrays.asList(
				new Person("Amy"),
				new Person("Justin"),
				new Person("Irene")
			));
		ArrayList<Person> personList2 = (ArrayList<Person>) personList; // personList is already a ArrayList, so it can auto cast
		
		System.out.println( "(personList == personTuple): " + (personList == personTuple) );
		System.out.println( "(personList == personList2): " + (personList == personList2) );
		
		personList.add(new Person("Monica")); // work well, it is a list
		System.out.println("add Monica: " + personList);
		
		

	}
	
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

}
