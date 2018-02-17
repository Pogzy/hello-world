package oata;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class HelloWorld {
	private static final Logger logger = LogManager.getLogger("HelloWorld");

    public static void main(String[] args) {
		logger.info("Hello World");          // the old SysO-statement
		// Prints "Hello, World" to the terminal window.
        System.out.println("Hello, World");
    }
}
