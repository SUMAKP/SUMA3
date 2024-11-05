package selenium_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe" );
		WebDriver driver =new ChromeDriver();	
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement dclick=driver.findElement(By.xpath("//button[.='Double-Click Me To See Alert']"));
		Actions act=new Actions(driver);
		act.doubleClick(dclick).perform();
		Thread.sleep(2000);
		driver.quit();

	}

}
