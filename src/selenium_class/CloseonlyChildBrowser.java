package selenium_class;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class CloseonlyChildBrowser  {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver12.exe" );
		WebDriver driver =new ChromeDriver();	
		driver.get("https://skpatro.github.io/demo/links/");
		driver.findElement(By.name("NewWindow")).click();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		String Parent_id=driver.getWindowHandle();
		Set<String> all_wh = driver.getWindowHandles();
		all_wh.remove(Parent_id);
		System.out.println(all_wh.size());
		for(String wh:all_wh)
		{
			driver.switchTo().window(wh);
			driver.manage().window().maximize();
			System.out.println(driver.getTitle());
			Thread.sleep(2000);
			driver.close();
		}
	

}
}
