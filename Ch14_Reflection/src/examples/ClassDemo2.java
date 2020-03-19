package examples;

public class ClassDemo2 {

	public static void main(String[] args) {
		System.out.println("boolean class: " + boolean.class);
		System.out.println("void class: " + void.class);
		
		int[] arr1 = new int[10];
		System.out.println("int[] class: " + arr1.getClass().getName());
		System.out.println("get element class: " + arr1.getClass().getComponentType());
		
		
		double[] arr2 = new double[10];
		System.out.println("double[] class: " + arr2.getClass().getName());
		
	}

}
