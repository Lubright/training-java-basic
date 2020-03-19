package com.examples.ex17_AutoCloseable;

public class AutoCloseableDemo2 {

	public static void main(String[] args) {
		try(Resource res1 = new Resource();
				ResourceOther res2 = new ResourceOther()){
			
			res1.doSome();
			res2.doSome();
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
