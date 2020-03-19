package examples;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ex3_ConsoleHanlder {

	public static void main(String[] args) {
		
		try {
			Logger logger = Logger.getLogger(Class.forName("examples.ex3_ConsoleHanlder").getName());
			
			// first set logger level
			logger.setLevel(Level.ALL);
			
			ConsoleHandler consoleHandler = new ConsoleHandler();
			consoleHandler.setLevel(Level.CONFIG);
			
			// add handler
			logger.addHandler(consoleHandler);
			
			logger.log(Level.INFO, "info");
			logger.log(Level.CONFIG, "config");
			System.out.println(Level.SEVERE.intValue());
			System.out.println(Level.INFO.intValue());
			System.out.println(Level.CONFIG.intValue());
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
