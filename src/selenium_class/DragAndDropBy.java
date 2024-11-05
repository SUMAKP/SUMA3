package selenium_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropBy {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver12.exe" );
		WebDriver driver =new ChromeDriver();	
		driver.get("https://demoapps.qspiders.com/ui/slider?sublist=0");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement ele=driver.findElement(By.xpath("//input[@class=' rangeInputSlidebar']"));
		
		Actions act=new Actions(driver);
		act.dragAndDropBy(ele,69,12).perform();
		Thread.sleep(2000);
		driver.quit();
	}

}
