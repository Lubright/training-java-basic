package examples.ex2_MethodReference;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class ex2_MethodReference3 {

	static class Person{
		private String name;
		
		public Person(String name) {
			this.name = name;
		}
		
		@Override
		public String toString() {
			return "Person [name=" + name + "]";
		}
	}
	
	public static <P, R> List<R> map( List<P> list,  Function<P, R> mapper){
		
		List<R> result = new ArrayList<>();
		
		for(P o : list) {
			System.out.println(o);
			result.add(mapper.apply(o));
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Justin", "Monica", "Amy"); // P:String 

		List<Person> persons = map(names, Person::new); // R:Person
		
		persons.forEach( System.out::println );
	}

}
