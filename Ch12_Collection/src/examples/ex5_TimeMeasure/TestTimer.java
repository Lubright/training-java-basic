package examples.ex5_TimeMeasure;

public class TestTimer {

	public static void main(String[] args) throws InterruptedException {
		MeasurementTimer timer = new MeasurementTimer("suite1");
		
		timer.start("1");
		Thread.sleep(200);
		timer.tick("2");
		
		Thread.sleep(400);
		timer.tick();
		
		timer.show();
		
	}

}
