package com.examples.ex17_AutoCloseable;

public class AutoCloseableDemo {

	public static void main(String[] args) {
		try(Resource res = new Resource()){
			res.doSome();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
