package examples.ex2_Generic_LinkedList;

public class GenericLinkedList {

	static class LinkedList<T>{
		
		private ListItem start = null; // First ListItem in the list
		private ListItem end = null; // Last ListItem in the list
		private ListItem current = null; // Current ListItem in the list
		private int count = 0;
		

		// Constructor
		public LinkedList() {
			
		}
		// Constructor to create a list containing one object
		public LinkedList(T item) {
			if(item != null) {
				this.current = this.end = this.start = new ListItem(item);
				count++;
			}
		}
		// Constructor a linked list from an array of objects
		public LinkedList(T[] items) {
			if(items != null)
			{
				for(T node : items) {
					addItem(node);
				}
				this.current = this.start;
			}
		}
		
		// Add new node to the list
		public void addItem(T item) {
			ListItem node = new ListItem(item);
			if(start == null) { // Is the list empty?
				start = end = node;
			}
			else {
				end.next = node; // Set next node for old end
				end = node; // then move end to new node
			}
			count++;
		}
		
		public T getFirst() {
			this.current = this.start;
			return start == null ? null:start.item;
		}
		
		public T getNext() {
			if(current != null) {
				current = current.next;
			}
			return current == null ? null:current.item;
		}
		
		public int size() {
			return count;
		}
		
		@Override
		public String toString() {
			StringBuffer content = new StringBuffer();
			content.append("[");
			T node = this.getFirst();
			
			while(node != null) {
				content.append(node+",");
				node = getNext();
			}
			content.deleteCharAt(content.lastIndexOf(","));
			
			content.append("]");
			return content.toString();
		}

		
		
		private class ListItem{

			T item;
			ListItem next;

			// Constructor
			public ListItem(T item) {
				this.item = item;
				this.next = null;
			}
			
			@Override
			public String toString() {
				return item.toString();
			}
		}
	}
	
	public static void main(String[] args) {
		LinkedList<String> strings = new LinkedList<String>();
		LinkedList<Long> numbers = new LinkedList<Long>();
		
		strings.addItem("Justin");
		strings.addItem("Monica");
		strings.addItem("Irene");
		
		System.out.println("strings: " + strings);
		System.out.println("size of strings: " + strings.size());
		
		numbers.addItem(1L);
		numbers.addItem(2L);
		numbers.addItem(3L);
		
		System.out.println("numbers: " + numbers);
		System.out.println("size of numbers: " + numbers.size());
		
		
		

	}

}
