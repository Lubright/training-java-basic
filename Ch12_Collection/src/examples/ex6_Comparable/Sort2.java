package examples.ex6_Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sort2 {
	
	static class Account2 implements Comparable<Account2>{
		private String name;
		private String id;
		private long balance;
		
		public Account2(String name, String id, long balance) {
			this.name = name;
			this.id = id;
			this.balance = balance;
		}
		
		@Override
		public String toString() {
			return "Account2 [name=" + name + ", id=" + id + ", balance=" + balance + "]";
		}

		@Override
		public int compareTo(Account2 o) {
			
			return (int) (this.balance - o.balance);
		}
		
	}

	public static void main(String[] args) {
		List<Account2> list = new ArrayList<>();
		
		list.add(new Account2("Justin", "X1234", 1000));
		list.add(new Account2("Monica", "X5678", 500));
		list.add(new Account2("Irene", "X2468", 200));
		
		Collections.sort(list);
		
		System.out.println(list);
	}

}
