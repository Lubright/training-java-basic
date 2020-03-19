package examples.ex3_forEach;

import java.util.ArrayList;
import java.util.List;

public class ex3_forEach {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		list.add("a");
		list.add("b");
		list.add("c");
		
		list.forEach( data -> System.out.println(data) );

	}

}
