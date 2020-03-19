package examples.ex3_Generic_Pair;

public class GenericPair {
	
	static class Pair<K, V>{

		private K key;
		private V value;
		
		//Constructor
		public Pair(K key, V value) {
			this.key = key;
			this.value = value;
		}
		
		public K getKey() {
			return key;
		}
		public V getValue() {
			return value;
		}
		public void setValue(V value) {
			this.value = value;
		}
		
		@Override
		public String toString() {
			return "Pair (" + key + ", " + value + ")";
		}
		
	}

	public static void main(String[] args) {
		Pair<Integer, String> entry = new Pair<>(1, "Justin");
		Pair<Integer, String> entry2 = new Pair<>(2, "Monica");
		Pair<Integer, String> entry3 = new Pair<>(3, "Irene");
		
		System.out.println("entry: " + entry);
	}

}
