package selenium_class;
import java.awt.event.KeyEvent;
import org.openqa.selenium.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import java.awt.AWTException;
import java.awt.Robot;

public class  Robot1{

	public static void main(String[] args) throws InterruptedException, AWTException 
	{

		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver12.exe" );
		WebDriver driver =new ChromeDriver();	
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		WebElement rclick=driver.findElement(By.xpath("//a[.='ಕನ್ನಡ']"));
		Actions act=new Actions(driver);
		act.contextClick(rclick).perform();
		Thread.sleep(2000);
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_T);
		Thread.sleep(2000);
		r.keyRelease(KeyEvent.VK_T);
		r.keyPress(KeyEvent.VK_WINDOWS);
		r.keyRelease(KeyEvent.VK_WINDOWS);
		
		r.keyPress(KeyEvent.VK_M);
		r.keyRelease(KeyEvent.VK_M);
		Thread.sleep(2000);
	//	driver.manage().window().maximize();
	//	r.keyPress(KeyEvent.VK_CONTROL);
	//	r.keyPress(KeyEvent.VK_TAB);
	//	r.keyRelease(KeyEvent.VK_CONTROL);
	//	r.keyRelease(KeyEvent.VK_TAB);
		//Thread.sleep(2000);

		
		
		
		driver.quit();
		
		

	}

}
