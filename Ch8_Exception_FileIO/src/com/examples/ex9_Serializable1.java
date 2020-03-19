package com.examples;
import java.io.*;

class Employee implements Serializable{
	private String name;
	private String ID;
	private float salary;
	
	public Employee(){
		
	}
	
	public Employee(String name, String ID, float salary){
		this.name = name;
		this.ID = ID;
		this.salary = salary;
	}
	public String getName(){
		return this.name;
	}
	public String getID(){
		return this.ID;
	}
	public float getSalary(){
		return this.salary;
	}
	
}

public class ex9_Serializable1 {

	public static void main(String[] args) {
		
		Employee s[] = new Employee[2];
		
		s[0] = new Employee("Alex", "001", 32000.0f);
		s[1] = new Employee("Ivy", "002", 43000.0f);
		
		try{
			FileOutputStream fos = new FileOutputStream("Employee.dat", false);
			ObjectOutputStream out = new ObjectOutputStream(fos);
			
			System.out.println("----- Write to file -----");
			
			out.writeObject(s);
			out.close();
			fos.close();
			
			hr('-', 50);
			
			System.out.println("----- Read from file -----");
			
			FileInputStream fis = new FileInputStream("Employee.dat");
			ObjectInputStream in = new ObjectInputStream(fis);
			
			Employee data[] = (Employee[]) in.readObject();
			
			for(int i=0; i<data.length; i++){
				System.out.println("index : " + (i+1));
				System.out.println("name: " + data[i].getName());
				System.out.println("ID: " + data[i].getID());
				System.out.println("salary: " + data[i].getSalary());
				hr('-', 50);
			}
			
			in.close();
			fis.close();
			
		}
		catch(IOException e){
			System.out.println(e.toString());
		}
		catch(Exception e){
			System.out.println(e.toString());
		}
		

	}
	
	static void hr(char c, int n)
	{
	    for(int i=0; i<n; i++)
	    {
	        System.out.print(c);
	    }
	    System.out.println();
	}

}
