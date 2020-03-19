package examples.ex1_Generic;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

// 定義泛型類別
class Container<T>{
	private T id; // 定義泛型的屬性 id
	private T[] arr;
	
	/* You cannot create objects or arrays of a parameterized type
	public Container() {
		id = new T(); // compile-time error
		arr = new T[10]; // compile-time error
	}
	*/
	
	public Container() {
		
	}
	
	@SuppressWarnings("unchecked")
	public Container(T param) {
		this.id = param;
		this.arr = (T[])new Object[10];
	}
	
	public void setId(T id) {
		this.id = id;
	}

	public void show() {
		System.out.println("id = " + id);
	}
	
}

public class ex1_Generic1 {

	public static void main(String[] args) throws ClassNotFoundException {
		
		Container<String> container1 = new Container<String>();
		Container<Integer> container2 = new Container<Integer>(1234);
		
		container1.setId("001");
		
		container1.show();
		container2.show();
		
		Type b = container1.getClass().
	       getGenericSuperclass();
		
		System.out.println(b);
//		System.out.println(container1.getClass().getGenericInterfaces().getClass().getSimpleName());
		Class<?> param1 = String.class;
		Constructor<?> constructor;
		Object[] argForContructor = new Object[1];
		argForContructor[0] = "2";
		try {
			constructor = Class.forName("java.lang.Long").getConstructor(new Class<?>[] {param1});
			System.out.println("constructor name: " + Modifier.toString(constructor.getModifiers()) + " " +constructor.getName());
			Object student1 = constructor.newInstance(argForContructor);
			
			System.out.println(Class.forName("java.lang.Long").getConstructor(new Class<?>[] {String.class}).newInstance(new Object[] {"2"}));
		} catch (NoSuchMethodException | SecurityException | InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		


	}

}
