package selenium_class;

import java.io.File;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class GenericScriptCaptureScreenshot {

	public static void getPhoto(WebDriver driver)throws Exception
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe" );
		WebDriver driver1 =new ChromeDriver();	
		driver1.get("https://www.facebook.com/login/");
		driver1.manage().window().maximize();
		String Photo="./photo/";
		Date d=new Date();
		String d1=d.toString();
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dst = new File(Photo + d1 + ".jpeg");
		FileHandler.copy(src, dst);
		
		
		

	}

}
