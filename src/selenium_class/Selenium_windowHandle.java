package selenium_class;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selenium_windowHandle {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver12.exe" );
		WebDriver driver =new ChromeDriver();	
		driver.get("https://www.selenium.dev/");
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement x=driver.findElement(By.xpath("//a[@href='/downloads']"));
		WebElement y=driver.findElement(By.xpath("//a[@href='/documentation']"));
		WebElement z=driver.findElement(By.xpath("//a[@href='/projects']"));
		WebElement a=driver.findElement(By.xpath("//a[@href='/support']"));
		WebElement b=driver.findElement(By.xpath("//a[@href='/blog']"));
	ArrayList<WebElement>l=new ArrayList<WebElement>();
		//TreeSet<WebElement>l=new TreeSet<WebElement>();
		l.add(x);
		l.add(y);
		l.add(z);
		l.add(a);
		l.add(b);
		Actions act=new Actions(driver);	
		Robot r=new Robot();
		for(WebElement we:l)
		{
			act.contextClick(we).perform();
			Thread.sleep(2000);
			
			r.keyPress(KeyEvent.VK_T);
			r.keyRelease(KeyEvent.VK_T);
			Thread.sleep(2000);
			
		}
		Set<String> all_wh=driver.getWindowHandles();
		ArrayList<String>tada=new ArrayList<String>(all_wh);
		String ko = tada.get(1);
	
		
		driver.switchTo().window(ko);
		Thread.sleep(3000);
		//driver.quit();
		driver.close();
		
		
		
		
		
				
				
		
		
		}

	}


