package com.examples.ex13_Serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestOrder {

	public static void main(String[] args) {
		String currentPath = System.getProperty("user.dir") + "/src/com/examples/ex13_Serialization/";
		System.out.println("currentPath: " + currentPath);
		
		System.out.println("----------- serializationTest --------------");
		serializationTest(currentPath + "order.dat");
		
		System.out.println("----------- deSerializationTest --------------");
		deSerializationTest(currentPath + "order.dat");
		
	}
	
	private static void serializationTest(String fileName){
		// Create a shirts order
		Shirt shirt1 = new Shirt("brand1", 100, 50);
		Shirt shirt2 = new Shirt("brand2", 10, 100);
		Shirt shirt3 = new Shirt("brand3", 150, 200);
		Order order = new Order(shirt1, shirt2, shirt3);
		
		Order.staticField = 22;
		
		// Write out the order
		try(FileOutputStream fout = new FileOutputStream(fileName);
				ObjectOutputStream out = new ObjectOutputStream(fout)){
			out.writeObject(order);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("=== serializationTest, " + order);

	}
	
	private static void deSerializationTest(String fileName){
		// Read from the order.dat
		try(FileInputStream fin = new FileInputStream(fileName);
				ObjectInputStream in = new ObjectInputStream(fin)){
			Order tempOrder = (Order)in.readObject();
			
			System.out.println("=== deSerializationTest, " + tempOrder);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
