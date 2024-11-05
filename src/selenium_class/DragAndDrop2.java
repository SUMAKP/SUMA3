package selenium_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe" );
		WebDriver driver =new ChromeDriver();	
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement src=driver.findElement(By.xpath("//div[@id='box1']"));
		WebElement des=driver.findElement(By.xpath("//div[.='Norway']"));
		Actions act=new Actions(driver);
		act.dragAndDrop(src,des).perform();
		Thread.sleep(2000);
		driver.quit();

	}

}
