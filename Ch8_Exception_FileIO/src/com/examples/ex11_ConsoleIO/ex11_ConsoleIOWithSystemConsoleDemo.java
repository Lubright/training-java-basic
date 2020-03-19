package com.examples.ex11_ConsoleIO;

import java.io.Console;

public class ex11_ConsoleIOWithSystemConsoleDemo {

	public static void main(String[] args) {
		Console console = System.console(); // get instance
		boolean check = false;
		
		System.out.println("test111");
		System.out.println(console);
		
		if(console != null){
			String account, password;
			do{
				account = console.readLine("%s", "Account: ");
				password = new String(console.readPassword("%s", "Password: "));
				
				if(account.equals("-1"))
					check = true;
				
				System.out.println("account: " + account);
				System.out.println("password: " + password);
				
			}while(!check);
			
		}

	}

}
