package test.ex1;

public class TortoiseHareDemo {

	public static void main(String[] args) {
		
		Tortoise tortoise = new Tortoise(10);
		Hare hare = new Hare(10);
		Thread tortoiseThread = new Thread(tortoise, "tortoise");
		Thread hareThread = new Thread(hare, "hare");
		
		tortoiseThread.start();
		hareThread.start();

	}

}
