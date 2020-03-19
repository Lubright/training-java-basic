package examples.ex3_List;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ex5_GetArrayListFromStream {

	public static void main(String[] args) {
		
		Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5);
		
		// Create a supplier for getting a new stream object
		Supplier<Stream<Integer>> supplier = new Supplier<Stream<Integer>>() {

			@Override
			public Stream<Integer> get() {
				Stream<Integer> stream = Stream.of(new Integer[] {1, 2, 3, 4, 5});
				return stream;
			}
		};
		
		System.out.println("supplier: " + supplier);
		
		Supplier<Stream<Integer>> supplier2 = ()->{
			return Stream.of(1, 2, 3, 4, 5);
		};
		
		// Convert Stream to List
		List<Integer> tuple = stream.collect(Collectors.toList());
		System.out.println("tuple: " + tuple);
		
		ArrayList<Integer> list = new ArrayList<>(supplier2.get().collect(Collectors.toList())); // get a new stream to collect to list
		System.out.println("ArrayList: " + list);
		
	}

}
