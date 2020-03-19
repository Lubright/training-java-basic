package com.examples;

import java.io.*;

public class ex9_BuffedWriter1 {

	public static void main(String[] args) throws IOException {

		FileWriter fw = new FileWriter("./test_output_file2.txt");
		BufferedWriter buf = new BufferedWriter(fw);
		
		for(int i=0; i<5; i++) {
			buf.write( Integer.toString( random(1,10) ) );
			buf.newLine();
			
		}
		buf.flush();
		fw.close();
		
	}
	
	static int random(int M, int N) {
	    int num;

	    num = (int)Math.floor( (Math.random()*(N-M+1) + M) );

	    return num;
	}

}
