package selenium_class;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sendkeys_checkbox {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe" );
		WebDriver driver =new ChromeDriver();	
		driver.get("file:///C:/Users/Admin/OneDrive/Desktop/checkbox1.html");
		driver.manage().window().maximize();
		List<WebElement> links=driver.findElements(By.xpath("//input[@type='text']"));
		int count=links.size();
		for(int i=0;i<=count-1;i++)       
		{
			WebElement w=links.get(i);
			w.sendKeys("HELLO");
			Thread.sleep(1000);
			
		}
		for(int i=count-1;i>=0;i--)
		{
			WebElement g=links.get(i);
			g.clear();
			Thread.sleep(1000);
			
		}
		driver.quit();


	}

}
