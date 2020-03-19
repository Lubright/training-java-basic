package test.ex1;

public class Hare implements Runnable {
	private int totalStep;
	private int step;
	private boolean[] flags = {true, false};
	
	public Hare(int totalStep) {
		this.totalStep = totalStep;
	}
	
	private boolean isStartToRun() {
		return flags[ ((int) (Math.random()*10) % 2) ];
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
			if(isStartToRun()) {
				step+=2;
				System.out.printf("hare run %d step\n", step);
			}
			else {
				System.out.println("hare is sleep...");
			}
		}
	}

}
