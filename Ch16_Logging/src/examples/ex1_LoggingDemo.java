package examples;

import java.util.logging.Logger;

public class ex1_LoggingDemo {

	public static void main(String[] args) {
		// use Logger.getLogger() to get instance
		Logger logger = Logger.getLogger(ex1_LoggingDemo.class.getName());
		
		try {
			System.out.println(args[0]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			logger.warning(e.toString());
		}

	}

}
