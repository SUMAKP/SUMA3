package selenium_class;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class genericphoto {

	public static void getPhoto(WebDriver driver) throws IOException {
		// TODO Auto-generated method stub
		String photo="./photo/";
		
	
		TakesScreenshot ts1=(TakesScreenshot)driver;
		File src1 = ts1.getScreenshotAs(OutputType.FILE);
		File dst1 = new File("C:\\failedTestCases\\hello.jpeg");
		FileHandler.copy(src1, dst1);
		

	}

}
