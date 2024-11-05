package testng3_Mon;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeMethod;

public class GenericScriptTestNG {
	
	public WebDriver driver;
	@BeforeMethod
	public void OpenApplcation()
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe" );
		 driver =new ChromeDriver();	
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
		
		
	}
	@AfterMethod
	public void closeApplcation()
	{
		driver.close();
	}

}
