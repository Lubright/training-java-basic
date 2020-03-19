package com.examples.CallByReference;

public class CallByReferenceDemo {
	
	static class DataBank{
		int a;
		int b;
		
		public DataBank(int a, int b) {
			this.a = a;
			this.b = b;
		}
		
		@Override
		public String toString() {
			return "DataBank [a=" + a + ", b=" + b + "]";
		}
	}
	
	public static void swap(DataBank obj) {
		// call by reference
		int temp = obj.a;
		
		obj.a = obj.b;
		obj.b = temp;
	}

	public static void main(String[] args) {
		DataBank dataBank = new DataBank(1, 2);
		System.out.println("before swap: " + dataBank);
		
		swap(dataBank);
		
		System.out.println("after swap: " + dataBank);
		
	}

}
