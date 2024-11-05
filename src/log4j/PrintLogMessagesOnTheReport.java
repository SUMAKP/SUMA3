package log4j;

import java.io.IOException;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.FileAppender;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.testng.annotations.Test;

public class PrintLogMessagesOnTheReport {
	@Test
	public void report() throws IOException
	{
		PatternLayout lay = new PatternLayout("%d %c %m %n"); //layout of logs
		FileAppender ap = new FileAppender(lay, "./Testdata/xyz.log"); // attach or bind layout and specify the path
		
		
		BasicConfigurator.configure(ap); //configure 4j
		Logger log=Logger.getLogger(this.getClass().getName()); //fetch object of log4j
		log.warn("testcase warning");
		log.info("testcase info");
		
		log.error("testcase error");
		
		
	}


}
