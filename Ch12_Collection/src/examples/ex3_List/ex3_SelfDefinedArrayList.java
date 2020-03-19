package examples.ex3_List;

import java.util.Arrays;

public class ex3_SelfDefinedArrayList {
	
	static class ArrayList<E>{
		private Object[] objects;
		private int currentIndex;
		
		public ArrayList() {
			this(16);
		}
		public ArrayList(int capacity) {
			objects = new Object[capacity];
		}
		
		public void add(E e) {
			if(currentIndex == objects.length) { // full of capacity
				objects = Arrays.copyOf(objects, objects.length*2);
			}
			objects[currentIndex++] = e;
		}
		public E get(int index) {
			return (E) objects[index];
		}
		
		public int size() {
			return currentIndex;
		}
		
	}

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("a");
		list.add("b");
		list.add("c");
		
		System.out.println(list.get(1));
		
	}

}
