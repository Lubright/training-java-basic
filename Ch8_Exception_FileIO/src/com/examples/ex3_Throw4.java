package com.examples;
import java.io.*;

class MyException2 extends Exception{
	private int code;
	
	public MyException2(int value) {
		this.code = value;
	}
	public String toString() {
		String result = "���{���L��\n" + 
						"���~�N�X��" + this.code + "\n" +
						"�гq�������H��\n";
		return result;
	}
	
}



public class ex3_Throw4 {

	public static void main(String[] args) {
		
		int w;
		
		try {
			w = getW();
			
			System.out.println("area = " + (Math.pow(w, 2)));
			
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		catch (Exception e) {
			System.out.println(e.toString());
		}

	}
	
	public static int getW() throws NumberFormatException, IOException, Exception {
		int result = 0;
		
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter a num > ");
		
		try {
			result = Integer.parseInt(buf.readLine());
			
			
			
		} catch (NumberFormatException e) {
//			e.printStackTrace();
			throw new NumberFormatException();
		} catch (IOException e) {
//			e.printStackTrace();
			throw new IOException();
		}
		catch (Exception e) {
//			System.out.println(e.toString());
			throw new MyException2(1);
		}
		
		return result;
	}

}
