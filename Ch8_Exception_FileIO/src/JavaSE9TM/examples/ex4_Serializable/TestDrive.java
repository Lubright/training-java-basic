package JavaSE9TM.examples.ex4_Serializable;

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
			
			System.out.println(Member.load("B5678"));
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		finally {
			
		}
		
		
	}

}
