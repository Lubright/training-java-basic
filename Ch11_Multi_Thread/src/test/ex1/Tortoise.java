package test.ex1;

public class Tortoise implements Runnable {
	private int totalStep;
	private int step;
	

	public Tortoise(int totalStep) {
		this.totalStep = totalStep;
	}


	@Override
	public void run() {
		System.out.println("Hare run is called...");
		System.out.println(Thread.currentThread().getName());
		while(step < totalStep) {
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			step++;
			System.out.printf("tortoise run %d steps...%n", step);
		}
	}

}
