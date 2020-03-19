package com.examples.ex13_Serialization2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

public class TestDrive {
	
	private static void serialization(String fileName, CCircle o) {
		System.out.println("=== serialization is called...");
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))){
			Date now = new Date();
			
			oos.writeObject(o);
			oos.writeObject(now);
			oos.writeObject(new Integer(10)); // first int obj
			oos.writeObject(new Integer(15)); // second int obj
			
			System.out.println("now: " + now);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("=== serialization done...");
	}
	private static void deSerialization(String fileName) {
		System.out.println("=== deSerialization is called...");
		
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))){
			
			CCircle temp = (CCircle) ois.readObject();
			Date temp2 = (Date) ois.readObject();
			Integer temp3 = (Integer) ois.readObject();
			Integer temp4 = (Integer) ois.readObject();
			
			System.out.println("temp: \n" + temp);
			System.out.println("temp2: " + temp2);
			System.out.println("temp3: " + temp3);
			System.out.println("temp4: " + temp4);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		System.out.println("=== deSerialization done...");
	}

	public static void main(String[] args) {
		CCircle c1 = new CCircle("c1", 2);
		
		System.out.println(c1);
		serialization("c1.dat", c1);
		
		deSerialization("c1.dat");
	}

}
