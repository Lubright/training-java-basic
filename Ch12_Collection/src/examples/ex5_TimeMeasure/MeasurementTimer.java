package examples.ex5_TimeMeasure;

import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/*
 * 
 * 
 * 
 * reference:
 * 			1. https://www.techiedelight.com/measure-elapsed-time-execution-time-java/
 */


public class MeasurementTimer {

	protected String testsuiteName;
	protected LinkedList<String> id_list;
	protected LinkedList<Long> startTime;
	protected LinkedList<Long> endTime;
	protected LinkedList<Long> elapsedTime;
	protected long time_div;
	protected String time_unit;
	private static boolean devMode = false;
	
	public MeasurementTimer() {
		this("default MeasurementTimer");
	}
	
	public MeasurementTimer(String testsuiteName) {
		this.testsuiteName = testsuiteName;
		id_list = new LinkedList<String>();
		startTime = new LinkedList<Long>();
		endTime = new LinkedList<Long>();
		elapsedTime = new LinkedList<Long>();
		time_div = (long) 1e3; // convert to us
		time_unit = "us";
	}
	
	// ----- getter and setter begin -----
	
	// ----- getter and setter end -----
	
	public void start() {
		// generate random id
		long temp = System.nanoTime();
		try {
			id_list.add(MyMD5Encrypt.encrypt(Long.toString(temp)));
			startTime.add( (temp / time_div) );
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}		
	}
	public void start(String id) {
		// add new start time
		id_list.add(id);
		startTime.add( (System.nanoTime() / time_div) );
		
	}
	public void stop() {
		endTime.add((System.nanoTime() / time_div));
		elapsedTime.add(endTime.getLast() - startTime.getLast());
	}
	public void tick() {
		// current time_diff
		endTime.add((System.nanoTime() / time_div));
		elapsedTime.add(endTime.getLast() - startTime.getLast());
		
		// next startTime
		// generate random id
		long temp = System.nanoTime();
		try {
			id_list.add(MyMD5Encrypt.encrypt(Long.toString(temp)));
			startTime.add( (temp / time_div) );
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}	
	}
	public void tick(String id) {
		// current time_diff
		endTime.add((System.nanoTime() / time_div));
		elapsedTime.add(endTime.getLast() - startTime.getLast());
		
		// next startTime
		id_list.add(id);
		startTime.add( (System.nanoTime() / time_div) );
	}
	
	
	public String toString() {
		StringBuffer content = new StringBuffer();
		Iterator<String> id_iter = id_list.iterator();
		Iterator<Long> startTime_iter = startTime.iterator();
		Iterator<Long> endTime_iter = endTime.iterator();
		Iterator<Long> elapsedTime_iter = elapsedTime.iterator();
		String id_temp;
		
		content.append("---------- " + testsuiteName + " ----------\n");
		while(elapsedTime_iter.hasNext() && id_iter.hasNext()) {
			id_temp = id_iter.next().toString();
			content.append(id_temp + " consume : " + elapsedTime_iter.next().toString() + " " + time_unit + "\n");
			if(devMode) {
				content.append(id_temp + " startTime : " + startTime_iter.next().toString() + " " + time_unit + "\n");
				content.append(id_temp + " endTime : " + endTime_iter.next().toString() + " " + time_unit + "\n");
			}
		}
		
		return content.toString();
	}
	
	public void reset() {
		id_list.clear();
		startTime.clear();
		endTime.clear();
		elapsedTime.clear();
	}
	
	public void show() {
		System.out.println(this);
	}
	
}
