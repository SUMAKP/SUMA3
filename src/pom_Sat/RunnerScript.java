package pom_Sat;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RunnerScript {
	@Test
	public void login() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver12.exe" );
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		 PomScript1 p=new  PomScript1(driver);
		 p.PassData("admin");
		 Thread.sleep(2000);
		 p.PassPwd("hello@123");
		 Thread.sleep(2000);
		 p.ValidClick();
		 
		 
	}

}
