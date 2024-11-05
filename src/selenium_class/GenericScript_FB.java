package selenium_class;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class GenericScript_FB {
	public WebDriver driver;
	//public Actions act;
	@BeforeMethod
	public void openappln()
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver12.exe" );
		 driver =new ChromeDriver();	
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//act=new Actions(driver);
	}
	@AfterMethod
	public void closeappn() throws IOException
	{
		genericphoto.getPhoto(driver);
		driver.close();
	}

}
