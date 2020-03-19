package examples.ex3_List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ex3_ArrayList2 {
	
	public static String hr(char c, int n)
    {
        StringBuffer content = new StringBuffer();
        for(int i=0; i<n; i++)
        {
            content.append(c);
        }
        return content.toString();
    }

	public static void print_hr(char c, int n)
    {
        for(int i=0; i<n; i++)
        {
            System.out.print(c);
        }
        System.out.println();
    }

	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		collectNameTo(names);
		
		print_hr('-', 50);
		System.out.println("========== " + "printUpperCase" + " ==========");
		
		printUpperCase(names);
	}
	
	static void collectNameTo(List<String> names) {
		Scanner console = new Scanner(System.in);
		boolean isFinished = false;
		
		do {
			System.out.print("guest name: ");
			String name = console.nextLine();
			if(name.equals("quit")) {
				break;
			}
			
			names.add(name);
			
		}while(!isFinished);
		
	}
	
	static void printUpperCase(List<String> names) {
		for(String name : names) {
			System.out.println(name.toUpperCase());
		}
	}

}
