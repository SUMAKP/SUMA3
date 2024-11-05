package log4j;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;

public class Logg {
	@Test
	public void report()
	{
		BasicConfigurator.configure(); //configure 4j
		Logger log=Logger.getLogger(this.getClass().getName()); //fetch object of log4j
		log.warn("testcase warning");
		log.info("testcase info");
		
		log.error("testcase error");
		
		
	}

}
