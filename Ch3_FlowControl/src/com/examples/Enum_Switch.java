package com.examples;
import java.io.IOException;
import java.util.*;

public class Enum_Switch {
	
	enum DIRECTION{
		LEFT,
		RIGHT,
		STRAIGHT
	}
	
	static String S_DIRECTION[] = {
			"LEFT",
			"RIGHT",
			"STRAIGHT"
	};

	public static void main(String[] args) {
		
		Scanner inputObj = new Scanner(System.in);
		String input_str;
		int input_int;
		DIRECTION direction = null;
		
		try {
			System.out.print("Please enter a chocie from 0 ~ 2: ");
			input_str = inputObj.nextLine();
			input_int = Integer.parseInt(input_str);
			
			switch(input_int) {
				case 0:
					direction = DIRECTION.LEFT;
					break;
				case 1:
					direction = DIRECTION.RIGHT;
					break;
				case 2:
					direction = DIRECTION.STRAIGHT;
					break;
				default:
					break;
			}
			
			System.out.println("direction = " + direction);
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
