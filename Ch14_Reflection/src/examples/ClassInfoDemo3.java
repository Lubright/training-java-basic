package examples;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/*
 * 16.1.3 從 Class 中獲取資訊
 * 套件的對應型態是 java.lang.Package
 * 建構方法的對應型態是 java.lang.reflect.Constructor
 * 方法成員的對應型態是 java.lang.reflect.Method
 * 資料成員的對應型態是 java.lang.reflect.Field
 * 範例 16.10 SimpleClassViewer.java
 * 
 * */

class CCircle{
	public static double PI = 3.14;
	public double r;
	public List<CCircle> objs;
	public Map<String, List<CCircle>> map;
	public List<Map<String, List<CCircle>>> map2;
}

public class ClassInfoDemo3 {

	public static void main(String[] args) {
		
		try {
			Class<?> CCircle_class = Class.forName("examples.CCircle");
			
			System.out.printf("name: %s\n", CCircle_class.getName());
			
			// get fields
			Field[] CCircle_fields = CCircle_class.getDeclaredFields();
			
			for(int i=0; i<CCircle_fields.length; i++) {
//				System.out.printf("%s ", Modifier.toString(CCircle_fields[i].getModifiers()));
				System.out.printf("%d: %s %s %s\n", 
						i, 
						Modifier.toString(CCircle_fields[i].getModifiers()), 
						CCircle_fields[i].getType(), 
						CCircle_fields[i].getName());
				System.out.printf("%d: %s; %s\n", 
						i,  
						CCircle_fields[i].toGenericString(), 
						CCircle_fields[i].getGenericType());
			}
			System.out.printf("-------------------------------------------\n");
			
			for(Field field : CCircle_fields) {
				System.out.print("Field: " + field.getName() + "; "); // field name
				Type type = field.getGenericType();
				
				System.out.print("type: " + type);
				
				if(type instanceof ParameterizedType) {
					ParameterizedType pType = (ParameterizedType) type;
					System.out.printf(", Raw type: " + pType.getRawType() + ", args< ");
//					System.out.println("Type args: " + pType.getActualTypeArguments()[0]);
					for(Type innerType : pType.getActualTypeArguments()) {
						System.out.print(innerType + ", ");
//						System.out.print(pType.getActualTypeArguments());
					}
//					System.out.print(pType.getActualTypeArguments());
					System.out.println(" >");
				}
				else {
					System.out.println("normal type: " + type.getTypeName());
				}
				System.out.printf("-----------------------\n");
			}
			System.out.printf("-------------------------------------------\n");
			for(Field field : CCircle_fields) {
				System.out.print("Field: " + field.getName() + "; "); // field name
				Type type = field.getGenericType();
				
				if(type instanceof ParameterizedType) {
					ParameterizedType pType = (ParameterizedType) type;
					System.out.printf(", Raw type: " + pType.getRawType().getTypeName() + "< ");
//					getInnerType( new LinkedList<Type>(Arrays.asList(pType.getActualTypeArguments())) );
					getInnerType2( new LinkedList<Type>(Arrays.asList(pType.getActualTypeArguments())) );
					System.out.println(" >");
				}
				else {
					System.out.println("normal type: " + type.getTypeName());
				}
				
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	static String getInnerType(LinkedList<Type> types) {
		System.out.println("\ngetInnerType");
		for(Type type : types) {
			if(type instanceof ParameterizedType) {
				ParameterizedType pType = (ParameterizedType) type;
				System.out.println(", Raw type: " + pType.getRawType().getTypeName() + " ");
				getInnerType( new LinkedList<Type>(Arrays.asList(pType.getActualTypeArguments())) );
			}
			else {
				System.out.println("type: " + type.getTypeName());
			}
		}
		
		return null;
	}
	
	static String getInnerType2(LinkedList<Type> types) {
		for(Type type : types) {
			if(type instanceof ParameterizedType) {
				ParameterizedType pType = (ParameterizedType) type;
				System.out.print(pType.getRawType().getTypeName() + "< ");
				getInnerType2( new LinkedList<Type>(Arrays.asList(pType.getActualTypeArguments())) );
				System.out.print(" >");
			}
			else {
				System.out.print(type.getTypeName() + ", ");
			}
		}
		
		return null;
	}

}
