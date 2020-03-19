package com.examples.ex11_ConsoleIO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex11_ConsoleIOWithSystemInDemo {

	public static void main(String[] args) {
		
		try(BufferedReader buf = new BufferedReader(new InputStreamReader(System.in))){
			String inputStr = "";
			
			do{
				System.out.print("Type -1 to quit: ");
				inputStr = buf.readLine();
				if(inputStr != null){
					inputStr.trim();
				System.out.println("read: " + inputStr);
				}
			}while(!inputStr.equals("-1"));
			System.out.println("System.exit(0)");
			System.exit(0);
		}
		catch(IOException e){
			e.printStackTrace();
		}

	}

}
