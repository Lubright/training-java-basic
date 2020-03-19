package com.exercise;
import java.io.*;

class Student{
	
	private String name;
	private int mathRecord;
	private int chnRecord;
	private int engRecord;
	
	public Student(){
		
	}
	public Student(String name, int mathRecord, int chnRecord, int engRecord){
		this.name = name;
		this.mathRecord = mathRecord;
		this.chnRecord = chnRecord;
		this.engRecord = engRecord;
	}
	
	public void writeToFile() throws IOException {
//		File file = new File("record.txt");
//		FileWriter fout = new FileWriter(file, true); // append to file
		
		FileOutputStream fos = new FileOutputStream("record.txt", true); // append mode
		BufferedWriter buf = new BufferedWriter(new OutputStreamWriter(fos));
		
		buf.write("name," + this.name);
		buf.newLine();
		buf.write("mathRecord," + this.mathRecord);
		buf.newLine();
		buf.write("chnRecord," + this.chnRecord);
		buf.newLine();
		buf.write("engRecord," + this.engRecord);
		buf.newLine();
		buf.flush();
		buf.close();
		
	}
	
}

public class HW83_FileWriter {

	public static void main(String[] args) throws IOException {

		new Student("Alex", 95, 90, 94).writeToFile();
		
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
