package selenium_class;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintTitleofBrowserandCloseOneBYone {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver12.exe" );
		WebDriver driver =new ChromeDriver();	
		driver.get("https://skpatro.github.io/demo/links/");
		
		driver.manage().window().maximize();
		driver.findElement(By.name("NewWindow")).click();
		Thread.sleep(2000);
		Set<String> all_wh = driver.getWindowHandles();
		System.out.println(all_wh.size());
		for(String wh:all_wh)
		{
			driver.switchTo().window(wh);
			driver.manage().window().maximize();
			System.out.println(driver.getTitle());
			Thread.sleep(2000);
			driver.close();
		}
		
	driver.quit();

	}

}
