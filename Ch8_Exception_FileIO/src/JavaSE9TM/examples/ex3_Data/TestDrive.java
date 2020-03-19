package JavaSE9TM.examples.ex3_Data;

import java.io.FileNotFoundException;
import java.io.IOException;

public class TestDrive {

	public static void main(String[] args) {
		Member[] members = {
			new Member("B1234", "Justin", 90),	
			new Member("B5678", "Monica", 95),
			new Member("B9876", "Irene", 88)
		};
		
		try {
			for(Member member : members) {
				member.save();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			
		}
		
		try {
			System.out.println(Member.load("B1234"));
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
