package test;

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
		StringBuffer name = null;
		Optional<StringBuffer> name_optional = Optional.ofNullable(name);
		
		name_optional.ifPresent( s->s.append("a"));
		name_optional = Optional.ofNullable(  name_optional.orElse(new StringBuffer("b"))  ) ;
		
		name_optional.ifPresent( s->s.append("a"));
		name_optional = Optional.ofNullable(  name_optional.orElse(new StringBuffer("c"))  ) ;
		
		System.out.println(name);
		
		
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
