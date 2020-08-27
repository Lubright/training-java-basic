package exercise;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class test {
	
	public static <T> void fun1(List<T> list, Consumer<? super T> action) {
		for(T t : list) {
			action.accept(t);
		}		
	}
	
	public static <T, U> U fun2(T t, Function<? super T,? extends U> mapper) {
		
		return mapper.apply(t);
	}

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Justin", "Monica", "Amy"); // P:String 
		fun1(names, System.out::println);
		String name1 = fun2(names.get(0), String::toUpperCase);
		System.out.println(name1);
		
	}

}
