package selenium_class;

import java.awt.AWTException;
import java.util.ArrayList;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Synchronization_DemoApp {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver12.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		
	Thread.sleep(2000);
	driver.findElement(By.xpath("//section[.='Web Elements']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//section[.='Synchronization']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//section[.='Page Loading']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='Open In New Tab']")).click();
		Thread.sleep(20000);

		Set<String> all_wh = driver.getWindowHandles();
		ArrayList<String>ar=new ArrayList<String>(all_wh);
		String a=ar.get(1);

			driver.switchTo().window(a);
			Thread.sleep(1000);
			
			//WebElement ele = driver.findElement(By.xpath("//input[@type='email']"));
			
			 WebElement dfg = driver.findElement(By.xpath("//input[@type='email']"));
			
			WebDriverWait wait = new WebDriverWait(driver,10);
		
		wait.until(ExpectedConditions.visibilityOf(dfg));
		
	dfg.sendKeys("sumakp268@gmail.com");
	        Thread.sleep(5000);
		driver.findElement(By.xpath("//button[.='Subscribe']")).click();
		
		
		    driver.quit();
	
		
	}

}
