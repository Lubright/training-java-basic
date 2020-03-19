package com.exercise.hw8;

import java.io.IOException;

class Book implements AutoCloseable{
	public void open(){
		System.out.println("Open");
	}

	@Override
	public void close() throws IOException {
		System.out.println("Close");
	}
}

public class hw8 {

	public static void main(String[] args) {
		try(Book f = new Book()){
			f.open();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
