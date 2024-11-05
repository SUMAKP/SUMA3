package selenium_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropDemoApps {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe" );
		WebDriver driver =new ChromeDriver();	
		driver.get("https://demoapps.qspiders.com/ui/dragDrop/dragToCorrect?sublist=1");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement w1=driver.findElement(By.xpath("//div[.='Mobile Charger']"));
		WebElement w2=driver.findElement(By.xpath("//div[.='Laptop Charger']"));
		WebElement w3=driver.findElement(By.xpath("//div[.='Mobile Cover']"));
		WebElement w4=driver.findElement(By.xpath("//div[.='Laptop Cover']"));
		
		WebElement d1=driver.findElement(By.xpath("//div[.='Mobile Accessories']"));
		WebElement d2=driver.findElement(By.xpath("//div[.='Laptop Accessories']"));
		Actions act=new Actions(driver);
		act.dragAndDrop(w1,d1).perform();
		Thread.sleep(2000);
		act.dragAndDrop(w2,d2).perform();
		Thread.sleep(2000);
		act.dragAndDrop(w3,d1).perform();
		Thread.sleep(2000);
		act.dragAndDrop(w4,d2).perform();
		Thread.sleep(2000);
		
		driver.quit();

	}

}
