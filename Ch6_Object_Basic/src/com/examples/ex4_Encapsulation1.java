package com.examples;

class Employee{
	public final static long COMPANY_ID = 1234567890L;
	
	private long empId;
	private String name;
	private String ssn;
	private double salary;
	
	public Employee(long empId, String name, String ssn, double salary){
		this.empId = empId;
		this.name = name;
		this.ssn = ssn;
		this.salary = salary;
	}
	
	// setter
	public void setName(String newName){
		if(newName != null){
			this.name = newName;
		}
	}
	
	// some function
	public void raiseSalary(double increase){
		this.salary += increase;
	}
	
	// getter
	public long getEmpId(){
		return this.empId;
	}
	
	public String getName(){
		return this.name;
	}
	
	public String getSsn(){
		return this.ssn;
	}
	
	public double getSalary(){
		return this.salary;
	}
	
}

public class ex4_Encapsulation1 {

	public static void main(String[] args) {

	}

}
