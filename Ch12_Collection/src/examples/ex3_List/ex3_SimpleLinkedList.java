package examples.ex3_List;

public class ex3_SimpleLinkedList {

	// define inner class: Node
	private class Node{
		Object object;
		Node next;
		
		public Node(Object o) {
			this.object = o;
		}
	}
	
	private Node root;
	
	public void add(Object element) {
		Node node = new Node(element);
		if(root == null) {
			root = node;
		}
		else {
			append(node);
		}
	}
	public void append(Node node) {
		Node pNode = root;
		while(pNode.next != null) {
			pNode = pNode.next;
		}
		pNode.next = node;
	}
	public int size() {
		int counter = 0;
		Node pNode = root;
		
		while(pNode != null) {
			pNode = pNode.next;
			counter++;
		}
		return counter;
	}
	public Object get(int index) {
		checkSize(index);
		return findElementByIndex(index);
	}
	
	private void checkSize(int index) {
		int totalSize = size();
		if(index > totalSize) {
			throw new IndexOutOfBoundsException( String.format("Index: %d, Size: %d", index, totalSize) );
		}
	}
	private Object findElementByIndex(int index) {
		Node pNode = root;
		int counter = 0;
//		Node target;
		
		for(int i = 0; i<index; i++) {
			pNode = pNode.next;
		}
		
		return pNode.object;
	}
	
	public static void main(String[] args) {
		ex3_SimpleLinkedList test = new ex3_SimpleLinkedList();
		
		test.add("a");
		test.add("b");
		test.add("c");
		
		System.out.println(test.size());
		System.out.println(test.get(2));
		
	}

}
