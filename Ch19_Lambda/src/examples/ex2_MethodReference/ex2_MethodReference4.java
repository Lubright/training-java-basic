package examples.ex2_MethodReference;

import java.util.function.Function;

public class ex2_MethodReference4 {
	
	public static <I, R> R mapFunction( I params, Function<I, R> mapper ) {

		return mapper.apply(params);
	}
	
	public <T extends Number> T add(T a, T b) {
		T result = (T) Double.valueOf(a.doubleValue() + b.doubleValue());
		
		return result;
	}
	
	public <T extends Number> T add(T... args) {
		Double result = Double.valueOf(0);
		
		for(int i = 0; i<args.length; i++) {
			result = result + args[i].doubleValue();
		}
		
		return (T) result;
	}

	public static void main(String[] args) {
		ex2_MethodReference4 obj = new ex2_MethodReference4();
		
//		System.out.println(obj.add(1, 2));
		
		// T:Double, R:Double
		Double result = mapFunction(new Double[] {1.0, 2.0, 3.0}, new ex2_MethodReference4()::add);
		System.out.println(result);
		
		Double result2 = mapFunction(new Double[] {1.0, 2.0, 3.0}, (arr)->{
			Double temp = Double.valueOf(0);
			for(int i = 0; i<arr.length; i++) {
				temp = temp + arr[i].doubleValue();
			}
			return temp;
		});
		System.out.println(result2);
	}

}
