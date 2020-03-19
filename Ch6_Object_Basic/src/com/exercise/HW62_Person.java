package com.exercise;

class Person{
	// data member
	private String name;
	private boolean gender;
	private int age;
	private String id;
	
	// default constructor
	public Person() {
		
	}
	// constructor
	public Person(String name, boolean gender, int age, String id) {
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.id = id;
	}
	
	// function: setName
	public void setName(String name) {
		this.name = name;
	}
	
	// function: getName
	public String getName() {
		return this.name;
	}
	
	// function: setData
	public void setData(String name, boolean gender, int age, String id) {
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.id = id;
	}
	
	// function: getGender
	public boolean getGender() {
		return this.gender;
	}
	
	// function: getAge
	public int getAge() {
		return this.age;
	}
	
	// function: getID
	public String getID() {
		return this.id;
	}
	
	public String toString() {
		StringBuffer buffer = new StringBuffer(100); 
		
		buffer.append(String.format("name = %s", this.name));
		buffer.append("\n");
		buffer.append(String.format("gender = %b", this.gender));
		buffer.append("\n");
		buffer.append(String.format("age = %d", this.age));
		buffer.append("\n");
		buffer.append(String.format("id = %s", this.id));
		
		return new String(buffer);
	}	
	
}

public class HW62_Person {

	static void hr(char c, int n)
	{
		for(int i=0; i<n; i++)
		{
			System.out.print(c);
		}
		System.out.println();
	}
	
	
	
	public static void main(String[] args) {
		
		Person persons[] = new Person[4];
		persons[0] = new Person("Amy", false, 20, "A123456789");
		persons[1] = new Person("Bob", true, 25, "A234567891");
		persons[2] = new Person("Candy", false, 28, "A345678912");
		persons[3] = new Person("David", true, 35, "A456789123");
		
		for(Person person: persons) {
			System.out.println(person);
			hr('-', 50);
		}
		
		
	}

}
