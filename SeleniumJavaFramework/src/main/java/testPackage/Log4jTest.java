package testPackage;

import org.apache.log4j.LogManager;
//import org.apache.log4j.Logger;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;



public class Log4jTest {
	static Logger logger = LogManager.getLogger("Test");
	
	public static void main(String[] args) {
		

		
		System.out.println("\n Hello World \n");
		
		logger.trace("Trace Message");
		logger.info("Info Message");
		logger.error("Error message");
		logger.fatal("Fatal Message");
		logger.warn("Warning Message");
		
		System.out.println("\n Test Done \n");
	}

}
