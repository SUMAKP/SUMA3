package selenium_class;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CloseOnlyParentBrowser {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe" );
		WebDriver driver =new FirefoxDriver();	
		driver.get("https://skpatro.github.io/demo/links/");
		String Parent_id=driver.getWindowHandle();
		
		driver.manage().window().maximize();
		driver.findElement(By.name("NewWindow")).click();
		Thread.sleep(2000);
		Set<String> all_wh = driver.getWindowHandles();
		System.out.println(all_wh.size());
		for(String wh:all_wh)
		{
			driver.switchTo().window(wh);
			System.out.println(driver.getTitle());
			Thread.sleep(2000);
			if(wh!=Parent_id)  //to close only child browser
			{
				driver.close();
			}
			/*if(wh.equals(Parent_id))  //to close only parent browser
			{
				driver.close();
			}*/
			
			
		}
		
	/*driver.quit();*/
	}

}
