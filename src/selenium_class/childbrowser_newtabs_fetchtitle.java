package selenium_class;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class childbrowser_newtabs_fetchtitle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver12.exe" );
		WebDriver driver =new ChromeDriver();	
		driver.get("https://demoapps.qspiders.com/ui/browser");
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement x=driver.findElement(By.xpath("//a[.='Open in new window']"));
		x.click();
		driver.manage().window().maximize();
		 Set<String> wh = driver.getWindowHandles(); 
			
			  ArrayList<String>ar=new ArrayList<String>(wh);
			  String a=ar.get(1);
			  driver.switchTo().window(a); 
			  driver.manage().window().maximize();
			 Thread.sleep(2000);
			 
		 

		
			/*
			 * for(String a_wh:wh) { driver.switchTo().window(a_wh);
			 * 
			 * driver.manage().window().maximize(); Thread.sleep(2000);
			 * System.out.println(driver.getTitle()); Thread.sleep(2000);
			 * 
			 * }
			 */
		
		WebElement y1=driver.findElement(By.xpath("//input[@name='email']"));
		y1.sendKeys("sumakp268@gmail.com");
		WebElement z=driver.findElement(By.xpath("//input[@name='password']"));
		z.sendKeys("sumakp268");
		WebElement a1=driver.findElement(By.xpath("//input[@id='confirm-password']"));
		a1.sendKeys("sumakp268");
		WebElement a2=driver.findElement(By.xpath("//button[.='Sign Up']"));
		a2.click();
		driver.quit();
		
		
		
		
		driver.quit();
		

	}

}
