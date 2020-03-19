package examples;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ex2_LoggingLevelDemo {

	public static void main(String[] args) {
		Logger logger = Logger.getLogger(ex2_LoggingLevelDemo.class.getName());
		
		// get current level
		System.out.println("logger level: " + logger.getParent().getLevel());
		logger.severe("severe message");
		logger.warning("warning message");
		logger.info("info message");
		
		// default level is INFO, so the following log is not printed
		logger.config("config message");
		logger.fine("fine message");
		logger.finer("finer message");
		logger.finest("finest message");

	}

}
