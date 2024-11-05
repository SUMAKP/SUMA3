package selenium_class;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeMethod;

public class GenericScriptTestNG {
	
	public WebDriver driver;
	WebElement ele;
	
	@BeforeMethod
	public void OpenApplcation()
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver12.exe" );
		 driver =new ChromeDriver();	
		 driver.get("https://www.facebook.com/");
		 WebElement ele1 = driver.findElement(By.id("email"));
		
				 ele1.sendKeys("sumakp268@gmail.com");
				 this.ele=ele1;
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
		
		
	}
	@AfterMethod
	public void closeApplcation() throws IOException
	{
	
		driver.close();
	}

}
