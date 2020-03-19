package com.examples.ex17_AutoCloseable;

public class Resource implements AutoCloseable {
	
	void doSome() {
		System.out.println("do something...");
	}

	@Override
	public void close() throws Exception {
		System.out.println("resource is closing...");
	}

}
