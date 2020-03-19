package examples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ex1_ListStreamDemo {

	static class Player{		
		private String name;
		private int age;
		
		public Player(String name, int age) {
			super();
			this.name = name;
			this.age = age;
		}
		
		public String getName() {
			return name;
		}
		public int getAge() {
			return age;
		}
		
		@Override
		public String toString() {
			return "Player [name=" + name + ", age=" + age + "]";
		}
	}
	
	public static void main(String[] args) {
		List<Player> list = new ArrayList<>();
		
		list.add(new Player("Justin", 39));
		list.add(new Player("Monica", 36));
		list.add(new Player("Irene", 6));
		
		System.out.println(list);
		
		Stream<Player> listStream = list.stream();
		
		listStream.filter( player -> player.getAge()>15 )
				  .map( Player::getName )
				  .map( String::toUpperCase )
				  .collect(Collectors.toList())
				  .forEach(System.out::println);
	}

}
