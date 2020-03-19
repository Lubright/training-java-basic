package examples.ex3_List;

import java.util.*;

import examples.ex5_TimeMeasure.MeasurementTimer;

public class ex3_ArrayList1 {

	public static void main(String[] args) throws InterruptedException {
		List<Integer> list1 = new ArrayList<Integer>();
		MeasurementTimer timer = new MeasurementTimer("suite1");
		
		timer.start("1");
		for(int i=0; i<10; i++) {
			list1.add(i);
		}
		timer.stop();
		
		timer.start("2");
		Thread.sleep(500);
		System.out.println("list1 = " + list1);
		timer.stop();
		
		timer.start("3");
		// size
		System.out.println("size = " + list1.size());
		
		// get
		System.out.println("list1[1] = " + list1.get(1));
		
		// set
		list1.set(1, 100);
		System.out.println("list1[1] = " + list1.get(1));
		
		// remove by value
		list1.remove(new Integer(100)); // delete by value
		System.out.println("list1 = " + list1);
		
		// remove by index
		list1.remove(1); // delete by index
		System.out.println("list1 = " + list1);
		
		// iterator 1
		for(Integer val : list1) {
			System.out.println(val);
		}
		
		// iterator 2
		Iterator<Integer> iter1 = list1.iterator();
		int val;
		while(iter1.hasNext()) {
			val = iter1.next();
			System.out.println(val);
		}
		
		// clear
		list1.clear();
		timer.stop();
		
		timer.show();

	}

}
