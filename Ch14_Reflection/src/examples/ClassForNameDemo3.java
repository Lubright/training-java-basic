package examples;


/*
 * 使用第二個版本的 forName() 方法時，設定 initialize 為 false，所以載入類別時並不會馬上執行靜態區塊，而會在使用類別建立物件時才去執行靜態區塊，第二個版本的 forName() 方法會需要一個類別載入器（Class loader），範例中所使用的是主執行緒的類別載入器，16.1.4 還會詳細介紹 Java 中的類別載入器機制。
 * 
 * */

public class ClassForNameDemo3 {

	public static void main(String[] args) {		
		
		try {
			Class<?> someClass = Class.forName("examples.A2",
												false, // 載入類別時不執行靜態方法
												Thread.currentThread().getContextClassLoader()); // 晚點會深入探討 class loader
			
			
			System.out.println("Declare A2 class");
			A2 obj1 = null;
			
			System.out.println("create obj1");
			obj1 = new A2();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		

	}

}
