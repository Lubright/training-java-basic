package examples;

import java.util.logging.ConsoleHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ex2_LoggingLevelDemo2 {

	public static void main(String[] args) throws ClassNotFoundException {
		Logger logger = Logger.getLogger(Class.forName("examples.ex2_LoggingLevelDemo").getName());
		
		logger.setLevel(Level.ALL); // first update logger level
		System.out.println("default level: " + logger.getParent().getLevel());
		
		// then set parent level
		for(Handler handler : logger.getParent().getHandlers()) {
			
			System.out.println("default handler: " + handler);
			System.out.println("default handler level: " + handler.getLevel());
			handler.setLevel(Level.parse("SEVERE")); // need set logger level first
		}
		
		logger.log(Level.parse("SEVERE"), "severe");
		logger.log(Level.WARNING, "warning");
		logger.log(Level.INFO, "info");
		logger.log(Level.CONFIG, "config");
		logger.log(Level.FINE, "fine");
		logger.log(Level.FINER, "finer");
		logger.log(Level.FINEST, "finest");
		


	}

}
