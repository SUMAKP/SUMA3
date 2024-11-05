package selenium_class;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class FlipkartBuynowScreenshot {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver12.exe" );
		WebDriver driver =new ChromeDriver();	
		driver.get("https://www.flipkart.com/");
		String p_id=driver.getWindowHandle();
		driver.manage().window().maximize();
		WebElement ijk=driver.findElement(By.xpath("//input[@type='text']"));
		ijk.sendKeys("iphone");
		ijk.sendKeys(Keys.ENTER);
		//Actions act=new Actions(driver);
		
		Thread.sleep(1000);
		WebElement ele=driver.findElement(By.xpath("//div[.='Apple iPhone 15 (Blue, 128 GB)']"));
		ele.click();
		Thread.sleep(1000);
		Set<String>all_wh=driver.getWindowHandles();
		all_wh.remove(p_id);
		for(String wh:all_wh)
		{
			driver.switchTo().window(wh);
		}
		WebElement df=driver.findElement(By.xpath("//button[@class='QqFHMw vslbG+ _3Yl67G _7Pd1Fp']"));
		
		 Point p = df.getLocation();
		 int x=p.getX();
		 int y=p.getY();
		 
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy("+x+","+y+")");
		
		TakesScreenshot ts=(TakesScreenshot)df;
		Thread.sleep(1000);
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dst=new File("D:\\FailedTestCases\\raj.jpeg");
		FileHandler.copy(src, dst);
		Thread.sleep(1000);
		driver.quit();
		
		
		/*String Parent_id=driver.getWindowHandle();
		Set<String> all_wh = driver.getWindowHandles();
		all_wh.remove(Parent_id);
		System.out.println(all_wh.size());
		for(String wh:all_wh)
		{
			driver.switchTo().window(wh);
			driver.manage().window().maximize();
			System.out.println(driver.getTitle());
			Thread.sleep(2000);
			driver.close();
		}*/

	}

}
