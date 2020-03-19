package examples;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class ex1_SimpleDemo {
	
	static Map<String, String> getDB(){
		Map<String, String> db = new HashMap<>();
		
		db.put("Justin", "caterpillar");
		db.put("Monica", "momor");
		db.put("Irene", "hamimi");
		
		return db;
	}
	
	static String getNickName(String key) {
		Map<String, String> db = getDB();
		
		return db.get(key);
	}
	
	static Optional<String> getNickNameWithOptional(String key) {
		Map<String, String> db = getDB();
		String result = db.get(key);
		
		return (result == null)? Optional.empty() : Optional.of(result);
	}
	
	static Optional<String> getNickNameWithOptional2(String key){
		Map<String, String> db = getDB();
		
		return Optional.ofNullable(db.get(key)); // simple representation
	}
	
	// main
	public static void main(String[] args) {
		String value = getNickName("Justin");
		
		if(value == null) {
			value = "default";
		}
		
		// case1: found
		System.out.println("value: " + value);
		print_hr('-', 50);
		
		// case2: not found
		value = getNickName("Justina");
		if(value == null) {
			value = "default";
		}
		System.out.println("value: " + value);
		print_hr('-', 50);
		
		// case3: Optional found
		Optional<String> val2_optional = getNickNameWithOptional("Justin");
		String val2 = "default";
		
		if(val2_optional.isPresent()) {
			val2 = val2_optional.get();
		}
		System.out.println("val2: " + val2);
		print_hr('-', 50);
		
		// case4: Optional not found
		val2_optional = getNickNameWithOptional("Justina");
		val2 = "default";
		
		if(val2_optional.isPresent()) {
			val2 = val2_optional.get();
		}
		System.out.println("val2: " + val2);
		print_hr('-', 50);
		
		// case5: recommendation found
		val2_optional = getNickNameWithOptional2("Justin");
		val2 = val2_optional.orElse("default");
		
		System.out.println("val2: " + val2);
		print_hr('-', 50);
		
		// case6: recommendation not found
		val2_optional = getNickNameWithOptional2("Justina");
		val2 = val2_optional.orElse("default");
		
		System.out.println("val2: " + val2);
		print_hr('-', 50);
	}

	// ------------ hr function ------------ //
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
	// ------------ hr function ------------ //
}
