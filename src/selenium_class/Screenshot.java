package selenium_class;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe" );
		WebDriver driver =new ChromeDriver();	
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		
	//WebElement ele=driver.findElement(By.xpath("//button[@name='login']")); //To capture individual element
	
		//TakesScreenshot ts=(TakesScreenshot) ele;//to capture individual element
		TakesScreenshot ts1=(TakesScreenshot) driver;//to capture whole browser
		File src=ts1.getScreenshotAs(OutputType.FILE);
		File dst=new File("D:\\FailedTestCases\\adv.jpeg");
		FileHandler.copy(src, dst);
		driver.quit();
		
	}

}
