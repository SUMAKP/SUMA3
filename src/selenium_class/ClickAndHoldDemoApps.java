package selenium_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickAndHoldDemoApps {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe" );
		WebDriver driver =new ChromeDriver();	
		driver.get("https://demoapps.qspiders.com/ui/clickHold?sublist=0");//https://demoapps.qspiders.com/ui/clickHold
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement cnh=driver.findElement(By.xpath("//div[@id='circle']"));
		Actions act=new Actions(driver);
		act.clickAndHold(cnh).perform();
		Thread.sleep(3000);
		driver.quit();

	}

}
