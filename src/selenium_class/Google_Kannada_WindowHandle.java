package selenium_class;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class Google_Kannada_WindowHandle {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver12.exe" );
		WebDriver driver =new ChromeDriver();	
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		 WebElement ele = driver.findElement(By.xpath("//a[.='தமிழ்']")); 
		 ele.click();
	     ele.sendKeys(Keys.ENTER);
		/*
		 * Actions act = new Actions(driver); 
		 * act.contextClick(ele).perform(); 
		 * Robot r=new Robot(); 
		 * r.keyPress(KeyEvent.VK_T); 
		 * r.keyRelease(KeyEvent.VK_T);
		 */
		
		Set<String> all_wh=driver.getWindowHandles();
		ArrayList<String> d=new ArrayList<String>(all_wh);
		driver.switchTo().window(d.get(1));
		driver.close();
		driver.switchTo().window(d.get(0));
		
		Thread.sleep(2000);
		driver.close();
		
		
	
	}

}
