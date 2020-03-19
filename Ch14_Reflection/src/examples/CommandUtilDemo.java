package examples;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Map;

/*
 * use new instance to manipulate object
 * 範例 16.18 CommandUtil.java
 * 範例 16.19 CommandUtilDemo.java
 * 
 * */

class CommandUtil{
    // 給定Map物件及要產生的Bean類別名稱
    // 可以取回已經設定完成的物件
	public static Object getCommand(Map requestMap, String className) throws Exception {
		System.out.println("=== getCommand ===");
		Class<?> c = Class.forName(className); // load user assigned class
		Object o = c.newInstance(); // create instance using default constructor
		
		return updateCommand(requestMap, o);
	}
	
	// 使用reflection自動找出要更新的屬性
	public static Object updateCommand(Map requestMap, Object obj) throws Exception {
		System.out.println("=== updateCommand ===");
		
		Method[] methods = obj.getClass().getDeclaredMethods();
		
		for(int i=0; i<methods.length; i++) {
            // 略過private、protected成員
            // 且找出必須是set開頭的方法名稱
			if(!Modifier.isPrivate(methods[i].getModifiers()) &&
					!Modifier.isProtected(methods[i].getModifiers()) &&
					methods[i].getName().startsWith("set")) {
				String subMethodName = methods[i].getName().substring(3).toLowerCase();
				
				System.out.println("\tsubMethodName: " + subMethodName);
				if(requestMap.containsKey(subMethodName)) {
					String param = (String)requestMap.get(subMethodName);
					Object[] values = findOutParamValues(param, methods[i]);
					methods[i].invoke(obj, values);
				}
			}
			
		}
		
		
		return obj;
	}
	
	private static Object[] findOutParamValues(String param, Method method) {
		Class<?>[] param_types = method.getParameterTypes();
		Object[] objs = new Object[param_types.length];
		int i = 0;
		
		for(Class<?> param_type : param_types) {
			if(param_type == String.class) {
				objs[i] = param;
			}
			else if(param_type == short.class) {
				objs[i] = Short.parseShort(param);
			}
			else if(param_type == int.class) {
				objs[i] = Integer.parseInt(param);
			}
			else if(param_type == Long.class) {
				objs[i] = Long.parseLong(param);
			}
			else if(param_type == float.class) {
				objs[i] = Float.parseFloat(param);
			}
			else if(param_type == double.class) {
				objs[i] = Double.parseDouble(param);
			}
			else if(param_type == boolean.class) {
				objs[i] = Boolean.parseBoolean(param);
			}
			
			i++;
		}
		
		return objs;
	}
	
}

public class CommandUtilDemo {

	public static void main(String[] args) throws Exception {
		Map<String, String> request = new HashMap<>();
		
		request.put("name", "Amy");
		request.put("score", "95");
		
		Object obj = CommandUtil.getCommand(request, "examples.Student");
		System.out.println(obj);
	}

}
