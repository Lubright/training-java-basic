package examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ex3_FlatMap {

	public static void main(String[] args) {
		List<Integer> PrimeNumbers = Arrays.asList(5, 7, 11, 13);
		List<Integer> OddNumbers = Arrays.asList(1, 3, 5);
		List<Integer> EvenNumbers = Arrays.asList(2, 4, 6, 8);
		
		List<List<Integer>> listOfListOfIntegers = Arrays.asList(PrimeNumbers, OddNumbers, EvenNumbers);
		
		System.out.println("The Structure before flattening is : " + listOfListOfIntegers);
		
		// Using flatMap for transformating and flattening
		List<Integer> listOfIntegers = listOfListOfIntegers.stream().flatMap(list->list.stream()).collect(Collectors.toList());
		
		System.out.println("The Structure after flattening is : " + listOfIntegers);
		
		// Using map and forEach
		List<Integer> listOfIntegers2 = new ArrayList<>();
		listOfListOfIntegers.stream().forEach( list->{
			list.stream().forEach(val->{
				listOfIntegers2.add(val);
			});
		});
		System.out.println("listOfIntegers2 : " + listOfIntegers2);
		
		

	}

}
